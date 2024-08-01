package io.github.jonaskahn.repositories

import com.google.inject.Inject
import io.github.jonaskahn.entities.Province
import io.jooby.Context
import jakarta.persistence.EntityManager

class ProvinceRepositoryImpl @Inject constructor(
    private val entityManager: EntityManager,
    private val context: Context
) : BaseRepositoryImpl<Province, Long>(entityManager, Province::class.java, context) , ProvinceRepository {


    override fun findAll(): List<Province> {
        return super.findAll()
    }
}