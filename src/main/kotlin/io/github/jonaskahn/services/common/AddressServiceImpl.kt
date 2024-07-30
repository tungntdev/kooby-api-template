package io.github.jonaskahn.services.common

import io.github.jonaskahn.entities.Province
import io.github.jonaskahn.repositories.ProvinceRepository
import io.jooby.Context
import jakarta.inject.Inject

class AddressServiceImpl @Inject constructor(
    private val provinceRepository: ProvinceRepository,
    private val context: Context
): AddressService {
    override fun getAllProvinces(): List<Province> {
        return provinceRepository.findAllProvince()
    }
}