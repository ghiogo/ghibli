package com.example.test.di

import com.example.data.repository.FilmsRepositoryImpl
import com.example.domain.repository.FilmsRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface RepositoriesModule {

    @Binds
    fun provideMangaRepository(repositoryImpl: FilmsRepositoryImpl): FilmsRepository

}