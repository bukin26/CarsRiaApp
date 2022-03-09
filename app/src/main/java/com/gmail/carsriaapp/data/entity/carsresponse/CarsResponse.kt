package com.gmail.carsriaapp.data.entity.carsresponse

import com.google.gson.annotations.SerializedName

data class CarsResponse(

    @field:SerializedName("CarsResponse")
    val carsResponse: List<CarsResponseItem> = emptyList()
)







