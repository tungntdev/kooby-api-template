package io.github.jonaskahn.app.controller.users

@io.jooby.annotation.Generated(UserController::class)
open class UserController_(protected val factory: java.util.function.Function<io.jooby.Context, UserController>) : io.jooby.MvcExtension, io.jooby.MvcFactory<UserController?> {
    
    constructor() : this(UserController::class)


    constructor(type: kotlin.reflect.KClass<UserController>) : this(java.util.function.Function<io.jooby.Context, UserController> { ctx: io.jooby.Context -> ctx.require<UserController>(type.java) })

    constructor(instance: UserController) : this(java.util.function.Function<io.jooby.Context, UserController> { instance })

    constructor(provider: java.util.function.Supplier<UserController?>) : this(java.util.function.Function<io.jooby.Context, UserController> { provider.get()!! })

    @Throws(Exception::class)
    override fun install(app: io.jooby.Jooby) {
      /** See [UserController.generateToken] */
      app.post("/users/generate-token", this::generateToken)
        .setReturnType(String::class.java)
        .setMvcMethod(UserController::class.java.getMethod("generateToken", io.github.jonaskahn.app.controller.users.UserTokenRequest::class.java))

      /** See [UserController.register] */
      app.post("/users/register", this::register)
        .setAttributes(
            java.util.Map.of(
                "Transactional", true) as Map<String, Any>
        )
        .setReturnType(io.jooby.StatusCode::class.java)
        .setMvcMethod(UserController::class.java.getMethod("register", io.github.jonaskahn.app.controller.users.UserRegisterRequest::class.java))
    }

    fun generateToken(ctx: io.jooby.Context): String {
      val c = this.factory.apply(ctx)
      return c.generateToken(ctx.body(io.github.jonaskahn.app.controller.users.UserTokenRequest::class.java))
    }

    fun register(ctx: io.jooby.Context): io.jooby.StatusCode {
      ctx.setResponseCode(io.jooby.StatusCode.OK)
      val c = this.factory.apply(ctx)
      c.register(ctx.body(io.github.jonaskahn.app.controller.users.UserRegisterRequest::class.java))
      return ctx.getResponseCode()
    }

    override fun supports(type: Class<UserController?>): Boolean {
        return type == UserController::class.java
    }

    override fun create(provider: java.util.function.Supplier<UserController?>): io.jooby.Extension {
        return UserController_(provider)
    }
}