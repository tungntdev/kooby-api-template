package io.github.jonaskahn.app.entities.converter

import io.github.jonaskahn.app.entities.enums.Status
import jakarta.persistence.AttributeConverter
import jakarta.persistence.Converter

@Converter(autoApply = true)
class StatusConverter : AttributeConverter<Status, Int> {
    override fun convertToDatabaseColumn(status: Status?): Int? {
        return status?.id
    }

    override fun convertToEntityAttribute(code: Int): Status {
        return Status.of(code)
    }
}
