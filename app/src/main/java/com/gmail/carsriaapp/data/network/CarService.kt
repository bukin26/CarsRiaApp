package com.gmail.carsriaapp.data.network

import com.gmail.carsriaapp.data.entity.Mark
import com.gmail.carsriaapp.data.entity.Model
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface CarService {

    @GET("auto/categories/1/marks?api_key=G4J71fqfiqaKOA6qiBrimW5O1Malg52XopyUoow7")
    suspend fun getMarks(): Response<List<Mark>>

    @GET("auto/categories/1/marks/{model}/models?api_key=G4J71fqfiqaKOA6qiBrimW5O1Malg52XopyUoow7")
    suspend fun getModels(@Path("model") model: Int): Response<List<Model>>


    companion object {
        private const val BASE_URL = "https://developers.ria.com/"

        fun create(): CarService {
            val logger =
                HttpLoggingInterceptor().apply { level = HttpLoggingInterceptor.Level.BODY }

            val client = OkHttpClient.Builder()
                .addInterceptor(logger)
                .build()

            return Retrofit.Builder()
                .baseUrl(BASE_URL)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(CarService::class.java)
        }
    }
}