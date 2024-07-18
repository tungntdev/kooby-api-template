package io.github.jonaskahn.app.services.user

import io.github.jonaskahn.exception.LogicException

class UserExistException : LogicException("User is existed") {
}