package io.github.jonaskahn.controller

import io.github.jonaskahn.constants.Roles
import io.github.jonaskahn.services.roles.AccessVerifier
import io.jooby.annotation.GET
import io.jooby.annotation.Path
import jakarta.inject.Inject

@Path
class TestRoleController @Inject constructor(private val accessVerifier: AccessVerifier) {

    @GET("/secure/test/admin")
    fun testAdmin(): String {
        accessVerifier.requireRole(Roles.ADMIN)
        return "ok"
    }
}