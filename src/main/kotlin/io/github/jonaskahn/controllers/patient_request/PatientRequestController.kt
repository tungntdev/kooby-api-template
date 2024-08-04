package io.github.jonaskahn.controllers.patient_request


import io.github.jonaskahn.entities.PatientRequest
import io.github.jonaskahn.services.patient_request.PatientRequestService
import io.jooby.annotation.POST
import io.jooby.annotation.Path
import io.jooby.annotation.QueryParam
import jakarta.inject.Inject

@Path("")
class PatientRequestController @Inject constructor(private val patientRequestService: PatientRequestService) {

    @POST("/patientRequest/create")
    fun createNewRequest(request: PatientRequestForm) {
        return patientRequestService.createRequest(request)
    }

    @POST("/patientRequest/find")
    fun findPatientRequest(request: SearchRequestForm): PaginationResult<PatientRequest> {
        return patientRequestService.findByKeywordWithPagination(request.keyword, request.offset, request.limit)
    }
}