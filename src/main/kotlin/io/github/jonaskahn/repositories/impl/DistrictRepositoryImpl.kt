package io.github.jonaskahn.repositories.impl

import io.github.jonaskahn.entities.District
import io.github.jonaskahn.repositories.repo.DistrictRepository
import io.jooby.Context
import jakarta.inject.Inject
import jakarta.persistence.EntityManager

class DistrictRepositoryImpl @Inject constructor(
    private val entityManager: EntityManager,
    context: Context
): BaseRepositoryImpl<District, Int>(entityManager, District::class.java, context), DistrictRepository {

    override fun getDistrictByProvince(id: Int): List<District> {
        val query = entityManager.createQuery(
            "SELECT d FROM District d WHERE d.idProvince = :idProvince", District::class.java
        )
        query.setParameter("idProvince", id)
        return query.resultList
    }

}