package com.gmail.carsriaapp.data.entity.carsresponse

import com.google.gson.annotations.SerializedName

data class SearchResult(

    @field:SerializedName("qs")
    val qs: Qs = Qs(),

    @field:SerializedName("last_id")
    val lastId: Int = 0,

    @field:SerializedName("count")
    val count: Int = 0,

    @field:SerializedName("ids")
    val ids: List<String> = emptyList()
)