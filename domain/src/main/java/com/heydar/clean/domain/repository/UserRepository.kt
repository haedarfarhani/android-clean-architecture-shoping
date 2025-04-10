package com.heydar.clean.domain.repository

import com.heydar.clean.domain.entities.UserEntity
import kotlinx.coroutines.flow.Flow

interface UserRepository {
    fun users(pageSize: Int): Flow<PagingData<UserEntity>>
    fun search(query: String, pageSize: Int): Flow<PagingData<UserEntity>>
    suspend fun getMovie(movieId: Int): Result<UserEntity>
    suspend fun checkFavoriteStatus(movieId: Int): Result<Boolean>
    suspend fun addMovieToFavorite(movieId: Int)
    suspend fun removeMovieFromFavorite(movieId: Int)
    suspend fun sync(): Boolean
}