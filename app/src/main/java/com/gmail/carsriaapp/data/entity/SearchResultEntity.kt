package com.gmail.carsriaapp.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "search_result")
data class SearchResultEntity(
    @PrimaryKey
    val uid: Int = 1,
    var lastId: Int,
    var count: Int,
    var ids: List<String>
)
