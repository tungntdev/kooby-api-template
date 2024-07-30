package io.github.jonaskahn.repositories

import com.google.inject.Inject
import io.github.jonaskahn.entities.Province
import io.jooby.Context
import jakarta.persistence.EntityManager

class ProvinceRepositoryImpl @Inject constructor(
    private val entityManager: EntityManager,
    private val context: Context
) : ProvinceRepository {
    override fun findAllProvince(): List<Province> {
        val query = entityManager.createQuery("SELECT p FROM Province p WHERE p.status = 1", Province::class.java)
        return query.resultList as List<Province>

    }
}