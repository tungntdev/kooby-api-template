package io.github.jonaskahn.repositories

import com.google.inject.ImplementedBy
import io.github.jonaskahn.entities.Province

@ImplementedBy(ProvinceRepositoryImpl::class)
interface ProvinceRepository {
    fun findAllProvince(): List<Province>
}