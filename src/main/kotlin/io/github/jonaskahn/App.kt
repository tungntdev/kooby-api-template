package io.github.jonaskahn

import io.github.jonaskahn.app.controller.HealthController
import io.github.jonaskahn.app.controller.users.UserController
import io.github.jonaskahn.assistant.Language
import io.github.jonaskahn.assistant.Response
import io.github.jonaskahn.exception.LogicException
import io.jooby.MediaType
import io.jooby.OpenAPIModule
import io.jooby.StatusCode
import io.jooby.flyway.FlywayModule
import io.jooby.guice.GuiceModule
import io.jooby.hibernate.HibernateModule
import io.jooby.hibernate.TransactionalRequest
import io.jooby.hikari.HikariModule
import io.jooby.jackson.JacksonModule
import io.jooby.kt.Kooby
import io.jooby.kt.runApp
import io.jooby.netty.NettyServer
import io.jooby.pac4j.Pac4jModule
import org.pac4j.http.client.direct.ParameterClient
import org.pac4j.jwt.config.signature.SecretSignatureConfiguration
import org.pac4j.jwt.credentials.authenticator.JwtAuthenticator


class App : Kooby({
    setup()
    decorate()
    routes()
})

fun Kooby.setup() {
    install(NettyServer())
    install(OpenAPIModule())
    install(JacksonModule())

    install(GuiceModule())

    install(HikariModule())
    install(FlywayModule())
    install(HibernateModule().scan("io.github.jonaskahn.app.entities"))
    use(TransactionalRequest().enabledByDefault(false))

    install(
        Pac4jModule()
            .client("/api/*") {
                val client = ParameterClient(
                    "token",
                    JwtAuthenticator(SecretSignatureConfiguration(it.getString("jwt.salt")))
                )
                client.isSupportGetRequest = true;
                client.isSupportPostRequest = true;
                client
            }
    )
    setContextAsService(true);
}

fun Kooby.decorate() {
    after {
        val acceptLanguage: String? = ctx.header("Accept-Language").valueOrNull()
        ctx.setDefaultResponseType(MediaType.json)
        if (failure == null) {
            ctx.responseCode = StatusCode.OK
            when (result) {
                is Response<*> -> {
                    ctx.render(result as Response<*>)
                }

                is StatusCode -> {
                    ctx.render(Response.ok(Language.of(acceptLanguage, "app.common.message.success")))
                }

                else -> {
                    ctx.render(Response.ok(result))
                }
            }
            return@after
        }
        val ex = failure as Throwable
        log.error("Something went wrong. detail\n", ex)
        val (statusCode, message, variables) = getStatusCodeAndMessage(ex)
        ctx.responseCode = statusCode
        ctx.render(Response.fail(Language.of(acceptLanguage, message, *variables)))
    }
}

private fun getStatusCodeAndMessage(ex: Throwable): Triple<StatusCode, String, Array<out Any?>> {
    return when (ex) {
        is LogicException -> {
            Triple(StatusCode.BAD_REQUEST, ex.message, ex.variables)
        }

        is IllegalArgumentException -> {
            Triple(StatusCode.BAD_REQUEST, "app.common.exception-invalid-args", arrayOf())
        }

        is NoSuchElementException -> {
            Triple(StatusCode.BAD_REQUEST, "app.common.exception.no-such-element", arrayOf())
        }

        is Exception -> {
            Triple(StatusCode.SERVER_ERROR, "app.common.exception.server-error", arrayOf())
        }

        else -> {
            Triple(StatusCode.SERVER_ERROR, "app.common.exception.unknown-error", arrayOf())
        }
    }
}

fun Kooby.routes() {
    mvc(HealthController::class.java)
    mvc(UserController::class.java)
}

fun main(args: Array<String>) {
    runApp(args, ::App)
}
