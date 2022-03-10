package com.gmail.carsriaapp.data.repo

import com.gmail.carsriaapp.data.database.SearchResultDao
import com.gmail.carsriaapp.data.entity.SearchResultEntity
import com.gmail.carsriaapp.data.network.CarService
import javax.inject.Inject

class SearchRepository @Inject constructor(
    private val service: CarService,
    private val searchResultDao: SearchResultDao
) {

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

    suspend fun saveCarsList(searchResultEntity: SearchResultEntity) = searchResultDao.insert(searchResultEntity)

}


