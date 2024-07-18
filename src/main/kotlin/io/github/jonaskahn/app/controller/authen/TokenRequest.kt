package io.github.jonaskahn.app.controller.authen

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
data class TokenRequest(
    val username: String? = null,
    val password: String? = null,
    val rememberMe: Boolean = false,
)