package io.github.jonaskahn.entities

import jakarta.persistence.*
import org.hibernate.annotations.ColumnDefault
import java.time.Instant
import java.time.LocalDate

@Entity
@Table(name = "assignments")
open class Assignment {
    @Id
    @Column(name = "id", nullable = false)
    open var id: Int? = null

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_patient_request")
    open var idPatientRequest: io.github.jonaskahn.entities.PatientRequest? = null

    @Column(name = "id_copy_user")
    open var idCopyUser: Int? = null

    @Column(name = "appointment_date")
    open var appointmentDate: LocalDate? = null

    @Column(name = "completion_date")
    open var completionDate: Instant? = null

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