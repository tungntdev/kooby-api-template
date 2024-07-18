package io.github.jonaskahn.app.services.authen

import at.favre.lib.crypto.bcrypt.BCrypt
import jakarta.inject.Singleton

@Singleton
internal class BcryptPasswordEncoderImpl : PasswordEncoder {
    override fun encode(input: String): String {
        return BCrypt.withDefaults().hashToString(12, input.toCharArray())
    }

    override fun matches(input: String, encoded: String): Boolean {
        return BCrypt.verifyer().verify(input.toCharArray(), encoded.toCharArray()).verified
    }
}