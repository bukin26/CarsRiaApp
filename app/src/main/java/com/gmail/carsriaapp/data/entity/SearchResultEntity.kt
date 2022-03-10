package com.gmail.carsriaapp.data.entity

import android.app.appsearch.SearchResult
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "search_result")
data class SearchResultEntity(
    @PrimaryKey
    val uid: Int,
    var lastId: Int,
    var count: Int,
    var ids: List<String>
)



