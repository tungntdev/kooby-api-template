package io.github.jonaskahn.app.services.authen

import io.github.jonaskahn.app.repositories.UserRepository
import io.github.jonaskahn.app.services.user.UserNotFoundException
import io.jooby.Environment
import jakarta.inject.Inject
import jakarta.inject.Singleton
import org.pac4j.core.profile.CommonProfile
import org.pac4j.core.profile.definition.CommonProfileDefinition
import org.pac4j.jwt.config.signature.SecretSignatureConfiguration
import org.pac4j.jwt.profile.JwtGenerator


@Singleton
internal class AuthenticationServiceImpl @Inject constructor(
    private val userRepository: UserRepository,
    private val passwordEncoder: PasswordEncoder,
    private val environment: Environment,
) : AuthenticationService {
    override fun generateToken(username: String, password: String): String {
        val users = userRepository.findByUsernameOrEmail(username) ?: throw UserNotFoundException()
        if (!passwordEncoder.matches(password, users.password!!)) {
            throw InvalidCredentialException()
        }
        val profile = CommonProfile()
        profile.id = users.preferredUsername.toString()
        profile.addAttribute(CommonProfileDefinition.DISPLAY_NAME, users.fullName)
        val jwtGenerator = JwtGenerator(
            SecretSignatureConfiguration(environment.config.getString("jwt.salt"))
        )
        return jwtGenerator.generate(profile)
    }
}