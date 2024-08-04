package io.github.jonaskahn.services.patient_request

import io.github.jonaskahn.controllers.patient_request.PaginationResult
import io.github.jonaskahn.controllers.patient_request.PatientRequestForm
import io.github.jonaskahn.entities.PatientRequest
import io.github.jonaskahn.repositories.repo.PatientRequestRepository
import io.jooby.Context
import jakarta.inject.Inject

internal class PatientRequestServiceImpl @Inject constructor(
    private val patientRequestRepository: PatientRequestRepository,
    private val context: Context
): PatientRequestService {
    override fun createRequest(request: PatientRequestForm) {
        val newRequest = PatientRequest()
        newRequest.numberOrder = request.numberOrder
        newRequest.patientNumber = request.patientNumber
        newRequest.medicineCode = request.medicineCode
        newRequest.patientName = request.patientName
        newRequest.department = request.department
        newRequest.saveNumber= request.saveNumber
        newRequest.inDate = request.inDate
        newRequest.outDate = request.outDate
        newRequest.receptionDate = request.receptionDate
        newRequest.appointmentPatientDate= request.appointmentPatientDate
        newRequest.copyQuantity = request.copyQuantity
        newRequest.copyCost = request.copyCost
        newRequest.note = request.note
        patientRequestRepository.create(newRequest)
    }

    override fun findByKeywordWithPagination(keyword: String, offset: Int, limit: Int): PaginationResult<PatientRequest> {
        return patientRequestRepository.findByKeywordWithPagination(keyword, offset, limit)
    }
}