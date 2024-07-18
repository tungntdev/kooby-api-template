package io.github.jonaskahn.app.services.authen

import com.google.inject.ImplementedBy

@ImplementedBy(BcryptPasswordEncoderImpl::class)
interface PasswordEncoder {
    fun encode(input: String): String

    fun matches(input: String, encoded: String): Boolean
}