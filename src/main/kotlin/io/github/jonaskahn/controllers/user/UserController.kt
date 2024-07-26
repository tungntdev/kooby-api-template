package io.github.jonaskahn.controllers.user

import io.github.jonaskahn.services.user.UserDto
import io.github.jonaskahn.services.user.UserService
import io.jooby.annotation.GET
import io.jooby.annotation.Path
import jakarta.inject.Inject

@Path("/secure/user")
class UserController @Inject constructor(private val userService: UserService) {

    @GET("/info")
    fun info(): UserDto {
        return userService.getCurrentUserInfo()
    }

    @GET("/info-with-executor")
    fun getInfo(): UserDto {
        return userService.getCurrentUserInfoWithExecutor()
    }
}