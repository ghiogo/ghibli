package com.example.domain.usecases

import com.example.domain.repository.FilmsRepository
import javax.inject.Inject

class FilmsUseCase @Inject constructor(
    private val filmsRepository: FilmsRepository
) {

    operator fun invoke() = filmsRepository.fetchFilms()
}