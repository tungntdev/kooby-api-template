package io.github.jonaskahn.repositories

import io.github.jonaskahn.entities.User
import jakarta.inject.Inject
import jakarta.inject.Singleton
import jakarta.persistence.EntityManager

@Singleton
class UserRepositoryImpl @Inject constructor(
    private val em: EntityManager
) : UserRepository {

    override fun findByUsernameOrEmail(username: String): User? {
        val query =
            em.createQuery("select u from users u where username = :username or email = :username", User::class.java)
        query.setParameter("username", username)
        return query.singleResult
    }

    override fun existsByUsernameOrEmail(username: String?, email: String?): Boolean {
        if (username == null && email == null) return false
        val sql = StringBuilder("SELECT 1 FROM users u WHERE 1 = 1 ")
        val params = mutableMapOf<String, String>()
        if (username != null) {
            sql.append(" AND u.username = :username")
            params["username"] = username
        }
        if (email != null) {
            sql.append(" AND u.email = :email")
            params["email"] = email
        }
        val query = em.createQuery("select exists ($sql)", Boolean::class.java)
        params.forEach { (k, v) -> query.setParameter(k, v) }
        return query.singleResult
    }

    override fun save(user: User) {
        em.persist(user)
    }
}