package io.github.jonaskahn.app.services.authen

import io.github.jonaskahn.exception.LogicException

class InvalidCredentialException : LogicException("Invalid username or password") {
}