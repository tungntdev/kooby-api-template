package io.github.jonaskahn.services.user

import io.github.jonaskahn.exception.LogicException

class UserNotFoundException : LogicException("User not found") {
}