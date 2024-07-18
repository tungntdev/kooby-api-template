package io.github.jonaskahn.app.services.user

import com.google.inject.ImplementedBy
import io.github.jonaskahn.app.controller.users.UserRegisterRequest

@ImplementedBy(UserServiceImpl::class)
interface UserService {
    fun createUser(request: UserRegisterRequest)
}