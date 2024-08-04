package io.github.jonaskahn.repositories.repo

import com.google.inject.ImplementedBy
import io.github.jonaskahn.controllers.patient_request.PaginationResult
import io.github.jonaskahn.entities.PatientRequest
import io.github.jonaskahn.repositories.impl.PatientRequestRepositoryImpl

@ImplementedBy(PatientRequestRepositoryImpl::class)
interface PatientRequestRepository: BaseRepository<PatientRequest, Long> {

    fun findByKeywordWithPagination(keyword: String, offset: Int, limit: Int): PaginationResult<PatientRequest>

    fun countByKeyword(keyword: String): Long
}