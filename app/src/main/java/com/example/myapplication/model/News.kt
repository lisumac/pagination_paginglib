package com.example.myapplication.model

import com.google.gson.annotations.SerializedName

data class News(
    val title: String,
    @SerializedName("urlToImage") val image: String
)


