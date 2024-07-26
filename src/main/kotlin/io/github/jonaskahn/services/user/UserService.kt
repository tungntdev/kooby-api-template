package io.github.jonaskahn.services.user

import com.google.inject.ImplementedBy
import io.github.jonaskahn.controllers.auth.UserRegisterRequest

@ImplementedBy(UserServiceImpl::class)
interface UserService {
    fun createUser(request: UserRegisterRequest)

    fun getCurrentUserInfo(): UserDto

    fun getCurrentUserInfoWithExecutor(): UserDto
}