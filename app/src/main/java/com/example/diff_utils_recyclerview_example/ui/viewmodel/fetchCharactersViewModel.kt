package com.example.diff_utils_recyclerview_example.ui.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.diff_utils_recyclerview_example.data.repository.CharactersRepo
import com.example.diff_utils_recyclerview_example.data.responses.ApiResource
import com.example.diff_utils_recyclerview_example.data.responses.CharactersResponse
import com.example.diff_utils_recyclerview_example.data.responses.DataResponse
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class fetchCharactersViewModel @Inject constructor(val charactersRepo: CharactersRepo): ViewModel() {

    private val _fetchCharacters = MutableLiveData<CharactersResponse>()
    val fetchCharacters: LiveData<CharactersResponse>get() = _fetchCharacters

    private val _errorResponse = MutableLiveData<String>()
    val errorResponse: LiveData<String> get() = _errorResponse

    fun getCharacters(){
        viewModelScope.launch {
        val charactersResponse = charactersRepo.getCharacters()
            Log.d("----->",charactersResponse.toString())
            when(charactersResponse){
                is ApiResource.Success ->{
                    _fetchCharacters.postValue(charactersResponse.value!!)
                }
                is ApiResource.Error ->{
                    _errorResponse.postValue(charactersResponse.errorBody.toString())
                }
            }
        }
    }

}