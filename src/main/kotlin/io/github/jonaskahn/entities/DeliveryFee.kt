package io.github.jonaskahn.entities

import jakarta.persistence.*
import org.hibernate.annotations.ColumnDefault

@Entity
@Table(name = "delivery_fee")
open class DeliveryFee {
    @Id
    @Column(name = "id", nullable = false)
    open var id: Int? = null

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_district")
    open var idDistrict: io.github.jonaskahn.entities.District? = null

    @Column(name = "fee")
    open var fee: Int? = null

    @ColumnDefault("1")
    @Column(name = "status")
    open var status: Byte? = null
}