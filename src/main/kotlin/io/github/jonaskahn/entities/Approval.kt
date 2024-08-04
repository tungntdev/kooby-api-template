package io.github.jonaskahn.entities

import jakarta.persistence.*
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size
import org.hibernate.annotations.ColumnDefault
import java.time.Instant

@Entity
@Table(name = "approvals")
open class Approval {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    open var id: Int? = null

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_patient_request", nullable = false)
    open var idPatientRequest: io.github.jonaskahn.entities.PatientRequest? = null

    @NotNull
    @Column(name = "id_user", nullable = false)
    open var idUser: Int? = null

    @Size(max = 255)
    @Column(name = "role")
    open var role: String? = null

    @Column(name = "approval_date")
    open var approvalDate: Instant? = null

    @ColumnDefault("0")
    @Column(name = "status")
    open var status: Byte? = null

    @Size(max = 4000)
    @Column(name = "comment", length = 4000)
    open var comment: String? = null

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