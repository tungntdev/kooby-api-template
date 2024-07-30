package io.github.jonaskahn.entities.converter

import io.github.jonaskahn.entities.enums.Status
import jakarta.persistence.AttributeConverter
import jakarta.persistence.Converter

@Converter(autoApply = true)
class StatusConverter : AttributeConverter<Status, Int> {
    override fun convertToDatabaseColumn(attribute: Status?): Int {
        return attribute?.id ?: Status.Code.ACTIVATED
    }

    override fun convertToEntityAttribute(dbData: Int?): Status {
        return dbData?.let { Status.of(it) } ?: Status.ACTIVATED
    }
}
