package io.github.jonaskahn.controllers.common

import io.github.jonaskahn.entities.Province
import io.github.jonaskahn.services.common.AddressService
import io.jooby.annotation.GET
import io.jooby.annotation.Path
import jakarta.inject.Inject

@Path("")
class AddressController @Inject constructor(private val addressService: AddressService) {

    @GET("/address/province")
    fun getAllProvince(): List<Province> {
        return addressService.getAllProvinces()
    }

}