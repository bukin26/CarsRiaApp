package com.gmail.carsriaapp.data.network

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.gmail.carsriaapp.data.entity.CarInfo
import dagger.assisted.Assisted
import dagger.assisted.AssistedFactory
import dagger.assisted.AssistedInject

class CarsPagingSource @AssistedInject constructor(
    private val carService: CarService,
    @Assisted private val idList: List<String>
) : PagingSource<Int, CarInfo>() {
    override fun getRefreshKey(state: PagingState<Int, CarInfo>): Int? {
        return null
    }

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, CarInfo> {

        val pageIndex = params.key ?: 0

        val cars = mutableListOf<CarInfo>()

        idList.forEachIndexed { index, id ->
            if (index >= pageIndex && index < (pageIndex + params.loadSize)) {
                cars.add(carService.getCar(id).body() ?: CarInfo())
            }

        }

        return try {

            return LoadResult.Page(
                data = cars,
                prevKey = if (pageIndex == 0) null else pageIndex - params.loadSize,
                nextKey = if (cars.size == params.loadSize) pageIndex + params.loadSize + 1 else null
            )
        } catch (e: Exception) {
            LoadResult.Error(e)
        }
    }

    @AssistedFactory
    interface Factory {
        fun create(@Assisted idList: List<String>): CarsPagingSource
    }
}