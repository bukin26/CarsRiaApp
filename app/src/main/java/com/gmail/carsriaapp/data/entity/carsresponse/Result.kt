package com.gmail.carsriaapp.data.entity.carsresponse

import com.google.gson.annotations.SerializedName

data class Result(

    @field:SerializedName("search_result")
    val searchResult: SearchResult = SearchResult()
)