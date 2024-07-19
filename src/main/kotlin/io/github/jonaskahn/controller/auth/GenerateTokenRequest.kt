package io.github.jonaskahn.controller.auth

import com.fasterxml.jackson.annotation.JsonAlias
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
data class GenerateTokenRequest(
    @JsonAlias("email")
    val username: String? = null,
    val password: String? = null,
    val rememberMe: Boolean = false,
)