package io.github.jonaskahn.controllers.patient_request

data class PaginationResult<T>(
    val totalItem: Long,
    val totalPage: Int,
    val currentItem: Int,
    val currentPage: Int,
    val data: List<T>
)