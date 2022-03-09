package com.gmail.carsriaapp.data.entity

import com.google.gson.annotations.SerializedName

data class Mark(
    @field:SerializedName("name")
    var name: String = "",

    @field:SerializedName("value")
    var value: Int = 0
)