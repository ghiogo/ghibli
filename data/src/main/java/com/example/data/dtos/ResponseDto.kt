package com.example.data.dtos

import com.example.domain.models.Response
import com.google.gson.annotations.SerializedName

data class ResponseDto(
    @SerializedName("image")
    val image: String = "",

    @SerializedName("original_title")
    val originalTitle: String = "",

    @SerializedName("release_date")
    val releaseDate: String = "",

    @SerializedName("director")
    val director: String = "",

    @SerializedName("original_title_romanised")
    val originalTitleRomanised: String = "",

    @SerializedName("description")
    val description: String = "",

    @SerializedName("producer")
    val producer: String = "",

    @SerializedName("running_time")
    val runningTime: String = "",

    @SerializedName("id")
    val id: String = "",

    @SerializedName("title")
    val title: String = "",

    @SerializedName("rt_score")
    val rtScore: String = "",

    @SerializedName("movie_banner")
    val movieBanner: String = ""
)

fun ResponseDto.toDomain(): Response {
    return Response(
        image, originalTitle,
        releaseDate, director,
        originalTitleRomanised,
        description,producer,
        runningTime,id,title,
        rtScore,movieBanner
    )
}

