package io.github.jonaskahn.entities

import jakarta.persistence.Basic
import jakarta.persistence.Column
import jakarta.persistence.PrePersist
import jakarta.persistence.PreUpdate
import org.hibernate.annotations.ColumnDefault
import java.time.Instant

open class BaseEntity {

    @ColumnDefault("current_timestamp()")
    @Column(name = "created_at")
    @Basic
    open var createdAt: Instant? = null

    @Column(name = "created_by")
    open var createdBy: Long? = null

    @ColumnDefault("current_timestamp()")
    @Column(name = "updated_at")
    @Basic
    open var updatedAt: Instant? = null

    @Column(name = "updated_by")
    open var updatedBy: Long? = null

    @PrePersist
    fun onPrePersist() {
        this.createdAt = Instant.now()
        this.updatedAt = Instant.now()
    }

    @PreUpdate
    fun onPreUpdate() {
        this.updatedAt = Instant.now()
    }
}