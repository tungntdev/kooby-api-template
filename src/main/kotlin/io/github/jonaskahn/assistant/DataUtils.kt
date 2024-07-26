package io.github.jonaskahn.assistant

import com.fasterxml.jackson.core.type.TypeReference
import org.apache.commons.lang3.ObjectUtils
import org.apache.commons.lang3.StringUtils
import org.slf4j.LoggerFactory


object DataUtils {

    private val log = LoggerFactory.getLogger(DataUtils::class.java)

    fun convertJsonStringCollection(data: String?): List<String>? {
        if (StringUtils.isEmpty(data)) {
            return listOf()
        }
        return try {
            JsonMapper.INSTANCE.readValue(data, object : TypeReference<List<String>>() {})
        } catch (e: Exception) {
            log.warn("Cannot convert json string to list", e)
            listOf()
        }
    }

    fun <T> convertJsonToString(data: T?): String? {
        if (ObjectUtils.isEmpty(data)) {
            return null
        }
        return try {
            JsonMapper.INSTANCE.writeValueAsString(data)
        } catch (e: Exception) {
            log.warn("Cannot convert data to json string", e)
            StringUtils.EMPTY
        }
    }
}
