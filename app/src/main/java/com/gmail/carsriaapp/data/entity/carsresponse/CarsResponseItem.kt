package com.gmail.carsriaapp.data.entity.carsresponse

import com.google.gson.annotations.SerializedName

data class CarsResponseItem(

    @field:SerializedName("result")
    val result: Result = Result(),

    @field:SerializedName("additional_params")
    val additionalParams: AdditionalParams? = null
)