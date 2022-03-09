package com.gmail.carsriaapp.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.gmail.carsriaapp.data.entity.Mark
import com.gmail.carsriaapp.data.repo.SearchRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.async
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SearchViewModel @Inject constructor(private val searchRepository: SearchRepository) :
    ViewModel() {

    val markList: MutableLiveData<List<Mark>> = MutableLiveData(listOf(Mark()))

    val mark: MutableLiveData<String> = MutableLiveData("")

    init {
        viewModelScope.launch {
            val response = searchRepository.getMarks()
            if (response.isSuccessful) {
                markList.value = response.body()
            }
        }
    }


}