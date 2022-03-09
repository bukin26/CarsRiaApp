package com.gmail.carsriaapp.data.network

import com.gmail.carsriaapp.data.entity.carsresponse.CarsResponse
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

    @GET("auto/search")
    suspend fun getCarsList(
        @Query("marka_id[0]") marka: String,
        @Query("model_id[0]") model: String,
        @Query("s_yers[0]") sYers: String,
        @Query("po_yers[0]") poYers: String,
        @Query("price_ot") priceOt: String,
        @Query("price_do") priceDo: String,
        @Query("currency") currency: String = "1",
        @Query("category_id") categoryId: String = "1",
        @Query("api_key") apiKey: String = "G4J71fqfiqaKOA6qiBrimW5O1Malg52XopyUoow7",
        @Query("with_photo") withPhoto: String = "1",
        @Query("countpage") countpage: String = "50"
    ): Response<CarsResponse>


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