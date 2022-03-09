package com.gmail.carsriaapp.data.entity.carsresponse

import com.google.gson.annotations.SerializedName

data class Qs(

    @field:SerializedName("size")
    val size: Int = 0,

    @field:SerializedName("from")
    val from: Int = 0,

    @field:SerializedName("fields")
    val fields: List<String> = emptyList()
)