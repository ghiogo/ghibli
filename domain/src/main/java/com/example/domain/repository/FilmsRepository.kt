package com.example.domain.repository

import com.example.domain.either.Either
import com.example.domain.models.Response
import kotlinx.coroutines.flow.Flow

interface FilmsRepository {

    fun fetchFilms(): Flow<Either<String, List<Response>>>
}