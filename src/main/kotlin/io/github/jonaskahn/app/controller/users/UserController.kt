package io.github.jonaskahn.app.controller.users

import io.github.jonaskahn.app.services.authen.AuthenticationService
import io.github.jonaskahn.app.services.user.UserService
import io.jooby.annotation.POST
import io.jooby.annotation.Path
import io.jooby.annotation.Transactional
import jakarta.inject.Inject

@Path("/users")
class UserController @Inject constructor(
    private val userService: UserService,
    private val authenticationService: AuthenticationService
) {

    @POST("/generate-token")
    fun generateToken(request: UserTokenRequest): String {
        return authenticationService.generateToken(request.username!!, request.password!!)
    }

    @POST("/register")
    @Transactional
    fun register(request: UserRegisterRequest) {
        userService.createUser(request)
    }
}