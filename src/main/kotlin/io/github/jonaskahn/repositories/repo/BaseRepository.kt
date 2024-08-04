package io.github.jonaskahn.repositories.repo

import io.github.jonaskahn.entities.BaseEntity

interface BaseRepository<Entity: BaseEntity , ID> {
    fun create(e: Entity)

    fun update(e: Entity)

    fun delete(e: Entity)

    fun deleteById(id: ID)

    fun findById(id: ID): Entity?

    fun findAll(): List<Entity>?

    fun findWithPagination(offset: Int, limit: Int): List<Entity>?
}