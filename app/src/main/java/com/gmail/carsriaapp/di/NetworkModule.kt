package com.gmail.carsriaapp.di

import com.gmail.carsriaapp.data.network.CarService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class NetworkModule {

    @Singleton
    @Provides
    fun provideCarService(): CarService {
        return CarService.create()
    }
}