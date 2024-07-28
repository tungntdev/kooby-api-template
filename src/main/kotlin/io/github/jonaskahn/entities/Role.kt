package io.github.jonaskahn.entities

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import jakarta.validation.constraints.Size
import org.hibernate.annotations.ColumnDefault
import java.time.Instant

@Entity
@Table(name = "roles")
open class Role {
    @Id
    @Column(name = "id", nullable = false)
    open var id: Int? = null

    @Size(max = 40)
    @Column(name = "name", length = 40)
    open var name: String? = null

    @Size(max = 255)
    @Column(name = "descriptions")
    open var descriptions: String? = null

    @ColumnDefault("1")
    @Column(name = "status")
    open var status: Byte? = null

    @ColumnDefault("current_timestamp()")
    @Column(name = "created_at")
    open var createdAt: Instant? = null

    @Column(name = "created_by")
    open var createdBy: Long? = null

    @ColumnDefault("current_timestamp()")
    @Column(name = "updated_at")
    open var updatedAt: Instant? = null

    @Column(name = "updated_by")
    open var updatedBy: Long? = null
}