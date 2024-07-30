package io.github.jonaskahn.services.common

import com.google.inject.ImplementedBy
import io.github.jonaskahn.entities.Province

@ImplementedBy(AddressServiceImpl::class)
interface AddressService {
    fun getAllProvinces(): List<Province>
}