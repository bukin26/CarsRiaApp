package com.gmail.carsriaapp.data.repo

import androidx.paging.PagingSource
import com.gmail.carsriaapp.data.entity.CarInfo
import com.gmail.carsriaapp.data.network.CarsPagingSource
import javax.inject.Inject

class ListRepository @Inject constructor(
    private val carPagingSourceFactory: CarsPagingSource.Factory
) {

    fun getCars(idList: List<String>): PagingSource<Int, CarInfo> {
        return carPagingSourceFactory.create(idList)
    }
}