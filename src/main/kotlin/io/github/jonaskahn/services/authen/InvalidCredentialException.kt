package io.github.jonaskahn.services.authen

import io.github.jonaskahn.exception.LogicException

class InvalidCredentialException : LogicException("Invalid username or password")