package com.example.presentation.models

import com.example.domain.models.Response

data class ResponseUI(
    val image: String = "",
    val originalTitle: String = "",
    val releaseDate: String = "",
    val director: String = "",
    val originalTitleRomanised: String = "",
    val description: String = "",
    val producer: String = "",
    val runningTime: String = "",
    val id: String = "",
    val title: String = "",
    val rtScore: String = "",
    val movieBanner: String = ""
)

fun Response.toUI() : ResponseUI {
    return ResponseUI(
        image,
        title,
        originalTitle
    )
}
