package io.github.jonaskahn.controller.users

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
data class UserTokenRequest(
    val username: String? = null,
    val password: String? = null,
    val rememberMe: Boolean = false,
)