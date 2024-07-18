package io.github.jonaskahn.app.controller.users

import com.fasterxml.jackson.annotation.JsonAlias

class RegisterUserRequest {
    @field:JsonAlias("full_name", "fullName")
    val name: String? = null
    val email: String? = null
    val username: String? = null
    var password: String? = null
}