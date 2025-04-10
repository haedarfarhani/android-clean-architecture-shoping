package com.heydar.clean.domain.usecase

import com.heydar.clean.domain.entities.UserEntity
import com.heydar.clean.domain.repository.UserRepository

class GetUsers(
    private val userRepository: UserRepository
) {
    suspend operator fun invoke(movieId: Int): Result<UserEntity> = userRepository.getMovie(movieId)
}