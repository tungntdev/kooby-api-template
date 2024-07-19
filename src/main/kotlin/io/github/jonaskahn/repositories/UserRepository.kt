package io.github.jonaskahn.repositories

import com.google.inject.ImplementedBy
import io.github.jonaskahn.entities.User

@ImplementedBy(UserRepositoryImpl::class)
interface UserRepository {
    fun findByUsernameOrEmail(username: String): User?

    fun findActivatedUserByPreferredUsername(preferredUsername: Long): User?

    fun existsByUsernameOrEmail(username: String?, email: String?): Boolean

    fun save(user: User)
}