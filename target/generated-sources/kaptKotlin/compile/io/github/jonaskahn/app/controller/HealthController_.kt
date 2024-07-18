package io.github.jonaskahn.app.controller

@io.jooby.annotation.Generated(HealthController::class)
open class HealthController_(protected val factory: java.util.function.Function<io.jooby.Context, HealthController>) : io.jooby.MvcExtension, io.jooby.MvcFactory<HealthController?> {
    
    constructor() : this(HealthController())

    constructor(instance: HealthController) : this(java.util.function.Function<io.jooby.Context, HealthController> { instance })

    constructor(provider: java.util.function.Supplier<HealthController?>) : this(java.util.function.Function<io.jooby.Context, HealthController> { provider.get()!! })

    @Throws(Exception::class)
    override fun install(app: io.jooby.Jooby) {
      /** See [HealthController.up] */
      app.get("/", this::up)
        .setAttributes(java.util.Map.of(
            "Operation.deprecated", false,
            "Operation.hidden", false,
            "Operation.ignoreJsonView", false,
            "Operation.requestBody", 
              java.util.Map.of(
                 "RequestBody.required", false,
                 "RequestBody.useParameterTypeSchema", false),
            "Operation.summary", "Health Check Endpoints"))
        .setReturnType(String::class.java)
        .setMvcMethod(HealthController::class.java.getMethod("up"))
    }

    fun up(ctx: io.jooby.Context): String {
      val c = this.factory.apply(ctx)
      return c.up()
    }

    override fun supports(type: Class<HealthController?>): Boolean {
        return type == HealthController::class.java
    }

    override fun create(provider: java.util.function.Supplier<HealthController?>): io.jooby.Extension {
        return HealthController_(provider)
    }
}