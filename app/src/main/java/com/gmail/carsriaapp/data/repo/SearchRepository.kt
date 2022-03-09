package com.gmail.carsriaapp.data.repo

import com.gmail.carsriaapp.data.network.CarService
import javax.inject.Inject

class SearchRepository @Inject constructor(private val service: CarService) {

    suspend fun getMarks() = service.getMarks()

    suspend fun getModels(model: Int) = service.getModels(model)

    suspend fun getCarsList(
        marka: String,
        model: String,
        sYers: String,
        poYers: String,
        priceOt: String,
        priceDo: String,
    ) = service.getCarsList(marka, model, sYers, poYers, priceOt, priceDo)

}


