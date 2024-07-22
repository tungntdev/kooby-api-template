package io.github.jonaskahn.controller.user

import io.github.jonaskahn.services.user.UserInfoDto
import io.github.jonaskahn.services.user.UserService
import io.jooby.annotation.GET
import io.jooby.annotation.Path
import jakarta.inject.Inject

@Path
class UserController @Inject constructor(private val userService: UserService) {

    @GET("/secure/user/info")
    fun info(): UserInfoDto {
        return userService.getCurrentUserInfo()
    }

    @GET("/secure/user/info-with-executor")
    fun getInfo(): UserInfoDto {
        return userService.getCurrentUserInfoWithExecutor()
    }
}