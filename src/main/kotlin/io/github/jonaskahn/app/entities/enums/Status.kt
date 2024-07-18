package io.github.jonaskahn.app.entities.enums

import com.fasterxml.jackson.annotation.JsonValue

enum class Status(@get:JsonValue val id: Int, val description: String) {
    INACTIVATED(StatusCode.INACTIVATED, "tortoise.common.enum.status.inactive"),
    ACTIVATED(StatusCode.ACTIVATED, "tortoise.common.enum.status.active"),
    LOCK(StatusCode.LOCK, "tortoise.common.enum.status.lock"),
    DELETED(StatusCode.DELETED, "tortoise.common.enum.status.deleted");

    companion object {
        private val valuesAsMap = entries.associateBy { it.id }
        fun of(id: Int): Status {
            return valuesAsMap.getOrElse(id) {
                throw NoSuchElementException("Status [$id] is not existed")
            }
        }
    }
}

object StatusCode {
    const val ACTIVATED = 1
    const val INACTIVATED = 2
    const val LOCK = 3
    const val DELETED = 9

}
