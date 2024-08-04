package io.github.jonaskahn.repositories.repo

import com.google.inject.ImplementedBy
import io.github.jonaskahn.entities.Province
import io.github.jonaskahn.repositories.impl.ProvinceRepositoryImpl

@ImplementedBy(ProvinceRepositoryImpl::class)
interface ProvinceRepository {
    fun findAll(): List<Province>
}