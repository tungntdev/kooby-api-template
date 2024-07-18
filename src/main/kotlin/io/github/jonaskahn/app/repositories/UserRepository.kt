package io.github.jonaskahn.app.repositories

import com.google.inject.ImplementedBy
import io.github.jonaskahn.app.entities.User

@ImplementedBy(UserRepositoryImpl::class)
interface UserRepository {
    fun findByUsernameOrEmail(username: String): User?

    fun existsByUsernameOrEmail(username: String?, email: String?): Boolean

    fun save(user: User)
}