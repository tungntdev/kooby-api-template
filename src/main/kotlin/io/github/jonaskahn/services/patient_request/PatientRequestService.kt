package io.github.jonaskahn.services.patient_request

import com.google.inject.ImplementedBy
import io.github.jonaskahn.controllers.patient_request.PaginationResult
import io.github.jonaskahn.controllers.patient_request.PatientRequestForm
import io.github.jonaskahn.entities.PatientRequest

@ImplementedBy(PatientRequestServiceImpl::class)
interface PatientRequestService {
    fun createRequest(request: PatientRequestForm)

    fun findByKeywordWithPagination(keyword: String, offset: Int, limit: Int): PaginationResult<PatientRequest>
}