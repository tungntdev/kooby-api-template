package io.github.jonaskahn.repositories

import io.jooby.Context
import org.pac4j.core.profile.UserProfile

open class BaseRepository(private val context: Context) {

    fun getCurrentLoggedUserId(): Long? {
        return context.getUser<UserProfile>()?.id?.toLong()
    }
}