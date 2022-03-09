package com.gmail.carsriaapp.data.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.gmail.carsriaapp.data.entity.SearchResultEntity
import com.gmail.carsriaapp.utilities.Converters

@Database(entities = [SearchResultEntity::class], version = 1)
@TypeConverters(Converters::class)
abstract class AppDatabase : RoomDatabase() {

    abstract fun searchResultDao(): SearchResultDao

    companion object {
        @Volatile
        private var instance: AppDatabase? = null

        fun getInstance(context: Context): AppDatabase {
            return instance ?: synchronized(this) {
                instance ?: buildDatabase(context).also { instance = it }
            }
        }

        private fun buildDatabase(context: Context): AppDatabase {

            return Room.databaseBuilder(
                context,
                AppDatabase::class.java, "database-name"
            ).build()

        }
    }
}