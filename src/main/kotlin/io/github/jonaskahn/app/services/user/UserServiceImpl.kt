package io.github.jonaskahn.app.services.user

import io.github.jonaskahn.app.controller.users.UserRegisterRequest
import io.github.jonaskahn.app.entities.User
import io.github.jonaskahn.app.entities.enums.Status
import io.github.jonaskahn.app.repositories.UserRepository
import io.github.jonaskahn.app.services.authen.PasswordEncoder
import jakarta.inject.Inject
import jakarta.inject.Singleton

@Singleton
internal class UserServiceImpl @Inject constructor(
    private val userRepository: UserRepository,
    private val passwordEncoder: PasswordEncoder,
) : UserService {

    override fun createUser(request: UserRegisterRequest) {
        if (userRepository.existsByUsernameOrEmail(request.username, request.email)) {
            throw UserExistException()
        }
        val newUser = User()
        newUser.email = request.email
        newUser.username = request.username ?: request.email
        newUser.fullName = request.name
        newUser.password = passwordEncoder.encode(request.password!!)
        newUser.status = Status.LOCK
        userRepository.save(newUser)
    }
}