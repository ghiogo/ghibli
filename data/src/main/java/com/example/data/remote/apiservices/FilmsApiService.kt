package com.example.data.remote.apiservices

import com.example.data.dtos.ResponseDto
import retrofit2.http.GET
import retrofit2.http.Query

interface FilmsApiService {

    @GET("films")
    fun fetchFilms(
        @Query("fields") fields: String = "",
        @Query("limit") limit: Int = 50
        ): List<ResponseDto>
}