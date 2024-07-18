package io.github.jonaskahn.app.entities

import io.github.jonaskahn.app.entities.converter.StatusConverter
import io.github.jonaskahn.app.entities.enums.Status
import jakarta.persistence.*
import org.hibernate.annotations.ColumnDefault

@Entity(name = "users")
open class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    open var id: Long? = null

    @Column(name = "username", nullable = false, length = 128)
    open var username: String? = null

    @Column(name = "preferred_username")
    open var preferredUsername: Long? = null

    @Column(name = "email", length = 128)
    open var email: String? = null

    @Column(name = "full_name")
    open var fullName: String? = null

    @Column(name = "password", length = 80)
    open var password: String? = null

    @ColumnDefault("1")
    @Column(name = "status", nullable = false)
    @Convert(converter = StatusConverter::class)
    open var status: Status? = Status.ACTIVATED

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as User

        return id == other.id
    }

    override fun hashCode(): Int {
        return id?.hashCode() ?: 0
    }
}