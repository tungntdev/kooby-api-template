package io.github.jonaskahn.entities

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import jakarta.validation.constraints.Size
import org.hibernate.annotations.ColumnDefault

@Entity
@Table(name = "province")
open class Province {
    @Id
    @Column(name = "id", nullable = false)
    open var id: Int? = null

    @Size(max = 255)
    @Column(name = "name")
    open var name: String? = null

    @ColumnDefault("1")
    @Column(name = "status")
    open var status: Byte? = null
}