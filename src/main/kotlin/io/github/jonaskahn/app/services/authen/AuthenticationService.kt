package io.github.jonaskahn.app.services.authen

import com.google.inject.ImplementedBy

@ImplementedBy(AuthenticationServiceImpl::class)
interface AuthenticationService {
    fun generateToken(username: String, password: String): String
}