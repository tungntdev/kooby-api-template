package io.github.jonaskahn.app.controller.users

import io.github.jonaskahn.app.services.user.UserService
import io.jooby.annotation.POST
import io.jooby.annotation.Path
import jakarta.inject.Inject

@Path("/api/users")
class UserController @Inject constructor(private val userService: UserService) {

    @POST("/register")
    fun register(request: RegisterUserRequest) {
        userService.createUser(request)
    }
}