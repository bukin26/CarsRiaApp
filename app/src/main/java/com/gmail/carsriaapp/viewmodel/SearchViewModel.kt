package com.gmail.carsriaapp.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.gmail.carsriaapp.data.entity.Mark
import com.gmail.carsriaapp.data.entity.Model
import com.gmail.carsriaapp.data.entity.SearchResultEntity
import com.gmail.carsriaapp.data.entity.carsresponse.CarsResponse
import com.gmail.carsriaapp.data.entity.carsresponse.SearchResult
import com.gmail.carsriaapp.data.repo.SearchRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import retrofit2.Response
import javax.inject.Inject

@HiltViewModel
class SearchViewModel @Inject constructor(
    private val searchRepository: SearchRepository
) :
    ViewModel() {

    val markList: MutableLiveData<List<Mark>> = MutableLiveData(listOf(Mark()))
    val modelList: MutableLiveData<List<Model>> = MutableLiveData(listOf(Model()))

    val mark: MutableLiveData<String> = MutableLiveData("")
    val model: MutableLiveData<String> = MutableLiveData("")

    val yearMin: MutableLiveData<String> = MutableLiveData("")
    val yearMax: MutableLiveData<String> = MutableLiveData("")

    val priceMin: MutableLiveData<String> = MutableLiveData("")
    val priceMax: MutableLiveData<String> = MutableLiveData("")

    init {
        viewModelScope.launch {
            val response = searchRepository.getMarks()
            if (response.isSuccessful) {
                markList.value = response.body()
            }
        }
    }

    fun addModels() {
        viewModelScope.launch {
            for (markName in markList.value!!) {
                if (markName.name == mark.value) {
                    val response = searchRepository.getMarks()
                    if (response.isSuccessful) {
                        modelList.value = searchRepository.getModels(markName.value).body()
                    }
                }
            }
        }
    }


    fun onSearchClick() {
        viewModelScope.launch {
            val response = searchRepository.getCarsList(
                mark.value.toString(),
                model.value.toString(),
                yearMin.value.toString(),
                yearMax.value.toString(),
                priceMin.value.toString(),
                priceMax.value.toString()
            )
            searchRepository.saveCarsList(convertResult(response))
        }
    }

    private fun convertResult(response: Response<CarsResponse>): SearchResultEntity {

        val searchResult: SearchResult = if (response.body()?.carsResponse?.isEmpty() == false) {
            response.body()?.carsResponse?.get(0)?.result?.searchResult ?: SearchResult()
        } else SearchResult()

        return SearchResultEntity(1, searchResult.lastId, searchResult.count, searchResult.ids)
    }
}