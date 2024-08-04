package io.github.jonaskahn.repositories.impl

import io.github.jonaskahn.controllers.patient_request.PaginationResult
import io.github.jonaskahn.entities.PatientRequest
import io.github.jonaskahn.entities.enums.Status
import io.github.jonaskahn.repositories.repo.PatientRequestRepository
import io.jooby.Context
import jakarta.inject.Inject
import jakarta.persistence.EntityManager

class PatientRequestRepositoryImpl @Inject constructor(
    private val entityManager: EntityManager,
    context: Context
): BaseRepositoryImpl<PatientRequest, Long>(entityManager, PatientRequest::class.java, context) , PatientRequestRepository {
    override fun findByKeywordWithPagination(keyword: String, offset: Int, limit: Int): PaginationResult<PatientRequest> {
        val criteriaBuilder = entityManager.criteriaBuilder
        val criteriaQuery = criteriaBuilder.createQuery(PatientRequest::class.java)
        val root = criteriaQuery.from(PatientRequest::class.java)

        val likeKeyword = "%${keyword.trim()}%"
        val predicate = criteriaBuilder.or(
            criteriaBuilder.like(root.get<String>("numberOrder").`as`(String::class.java), likeKeyword),
            criteriaBuilder.like(root.get<String>("patientNumber"), likeKeyword),
            criteriaBuilder.like(root.get<String>("patientName"), likeKeyword),
            criteriaBuilder.like(root.get<String>("medicineCode"), likeKeyword)
        )

        val statusCondition = criteriaBuilder.equal(root.get<Status>("status"), Status.ACTIVATED)
        criteriaQuery.select(root).where(criteriaBuilder.and(predicate, statusCondition))

        // Get total items count
        val countQuery = criteriaBuilder.createQuery(Long::class.java)
        countQuery.select(criteriaBuilder.count(root))
        countQuery.where(criteriaBuilder.and(predicate, statusCondition))
        val totalItem = entityManager.createQuery(countQuery).singleResult

        // Get paginated results
        val query = entityManager.createQuery(criteriaQuery)
        query.firstResult = offset
        query.maxResults = limit
        val data = query.resultList

        val totalPage = if (totalItem % limit == 0L) {
            (totalItem / limit).toInt()
        } else {
            (totalItem / limit).toInt() + 1
        }
        val currentPage = (offset / limit) + 1
        val currentItem = data.size

        return PaginationResult(
            totalItem = totalItem,
            totalPage = totalPage,
            currentItem = currentItem,
            currentPage = currentPage,
            data = data
        )
    }

    override fun countByKeyword(keyword: String): Long {
        TODO("Not yet implemented")
    }

    override fun deleteById(id: Long) {
        TODO("Not yet implemented")
    }

    override fun findById(id: Long): PatientRequest? {
        TODO("Not yet implemented")
    }
}