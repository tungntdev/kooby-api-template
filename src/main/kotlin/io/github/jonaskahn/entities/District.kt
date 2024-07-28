package io.github.jonaskahn.entities

import jakarta.persistence.*
import jakarta.validation.constraints.Size
import org.hibernate.annotations.ColumnDefault

@Entity
@Table(name = "district")
open class District {
    @Id
    @Column(name = "id", nullable = false)
    open var id: Int? = null

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_province")
    open var idProvince: io.github.jonaskahn.entities.Province? = null

    @Size(max = 255)
    @Column(name = "name")
    open var name: String? = null

    @ColumnDefault("1")
    @Column(name = "status")
    open var status: Byte? = null
}