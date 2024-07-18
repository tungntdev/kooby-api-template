package io.github.jonaskahn.app.services.user

import io.github.jonaskahn.exception.LogicException

class UserNotFoundException : LogicException("User not found") {
}