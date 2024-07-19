package io.github.jonaskahn.services.user

import io.github.jonaskahn.entities.enums.Status
import java.io.Serializable
import java.time.Instant

open class UserInfoDto : Serializable {
    open var id: Long? = null
    open var username: String? = null
    open var email: String? = null
    open var fullName: String? = null
    open var status: Status? = null
        set(value) {
            field = value
            this.statusName = value?.description
        }
    open var statusName: String? = null
    open var createdAt: Instant? = null
    open var createdBy: String? = null
    open var updatedAt: Instant? = null
    open var updatedBy: Int? = null
}