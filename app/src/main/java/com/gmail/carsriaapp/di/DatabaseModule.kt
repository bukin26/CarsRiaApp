package com.gmail.carsriaapp.di

import android.content.Context
import com.gmail.carsriaapp.data.database.AppDatabase
import com.gmail.carsriaapp.data.database.SearchResultDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class DatabaseModule {

    @Singleton
    @Provides
    fun provideAppDatabase(@ApplicationContext context: Context): AppDatabase {
        return AppDatabase.getInstance(context)
    }

    @Provides
    fun provideSearchResultDao(appDatabase: AppDatabase): SearchResultDao {
        return appDatabase.searchResultDao()
    }

}