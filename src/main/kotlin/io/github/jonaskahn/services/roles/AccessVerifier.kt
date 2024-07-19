package io.github.jonaskahn.services.roles

import com.google.inject.ImplementedBy

@ImplementedBy(AccessVerifierImpl::class)
interface AccessVerifier {

    fun hasRole(role: String): Boolean

    fun requireRole(role: String)

    fun hasAnyRoles(vararg roles: String): Boolean

    fun requireAnyRoles(vararg roles: String)
}