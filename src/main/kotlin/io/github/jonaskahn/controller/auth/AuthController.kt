package io.github.jonaskahn.controller.auth

import io.github.jonaskahn.services.authen.AuthenticationService
import io.github.jonaskahn.services.user.UserService
import io.jooby.annotation.POST
import io.jooby.annotation.Path
import jakarta.inject.Inject

@Path("/auth")
class AuthController @Inject constructor(
    private val userService: UserService,
    private val authenticationService: AuthenticationService
) {

    @POST("/generate-token")
    fun generateToken(request: GenerateTokenRequest): String {
        return authenticationService.generateToken(request.username!!, request.password!!)
    }

    @POST("/register")
    fun register(request: UserRegisterRequest) {
        userService.createUser(request)
    }
}