package io.github.jonaskahn.constants

object Jwt {
    object Attribute {
        const val UID = "uid"
        const val JTI = "jti"
        const val EXP = "exp"
    }

    object RedisPrefix {
        const val USER_TOKEN = "UserToken"
    }
}