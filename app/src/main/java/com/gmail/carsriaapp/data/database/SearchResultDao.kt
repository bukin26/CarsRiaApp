package com.gmail.carsriaapp.data.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.gmail.carsriaapp.data.entity.SearchResultEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface SearchResultDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(searchResultEntity: SearchResultEntity)

    @Query("SELECT * FROM search_result")
    fun getResult(): Flow<SearchResultEntity>
}