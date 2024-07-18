package io.github.jonaskahn.app.controller.authen

import io.github.jonaskahn.app.services.authen.AuthenticationService
import io.jooby.annotation.GET
import io.jooby.annotation.Path
import jakarta.inject.Inject

@Path("/api/auth")
class AuthenticationController @Inject constructor(
    private val authenticationService: AuthenticationService
) {
    @GET("/token")
    fun generateToken(): String {
        return ""
    }
}