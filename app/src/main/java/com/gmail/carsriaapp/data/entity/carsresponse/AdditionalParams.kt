package com.gmail.carsriaapp.data.entity.carsresponse

import com.google.gson.annotations.SerializedName

data class AdditionalParams(

    @field:SerializedName("catalog_name")
    val catalogName: String = "",

    @field:SerializedName("elastica")
    val elastica: Boolean = false,

    @field:SerializedName("lang_id")
    val langId: Int = 0,

    @field:SerializedName("view_type_id")
    val viewTypeId: Int = 0,

    @field:SerializedName("section")
    val section: String = "",

    @field:SerializedName("page")
    val page: Int = 0,

    @field:SerializedName("nodejs")
    val nodejs: Boolean = false,

    @field:SerializedName("target")
    val target: String = ""
)