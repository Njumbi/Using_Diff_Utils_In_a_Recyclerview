package com.example.diff_utils_recyclerview_example.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.diff_utils_recyclerview_example.data.remote.ResponseState
import com.example.diff_utils_recyclerview_example.data.repository.CharactersRepo
import com.example.diff_utils_recyclerview_example.domain.models.CharacterDetails
import com.example.diff_utils_recyclerview_example.ui.state.CharactersDetailsUiState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class FetchCharactersViewModel @Inject constructor(val charactersRepo: CharactersRepo) :
    ViewModel() {

    private val _charactersDetailsUiState = MutableStateFlow(CharactersDetailsUiState(isLoading = true))
    val charactersDetailsUiState = _charactersDetailsUiState.asStateFlow()

    private val charactersList = mutableListOf<CharacterDetails>()

    init {
        getCharacters()
    }
    fun getCharacters() {
        viewModelScope.launch {
            val characters = charactersRepo.getCharacters()
            characters.collectLatest { charactersState ->
                when (charactersState) {
                    is ResponseState.Success -> {
                        charactersList.apply {
                            clear()
                            addAll(charactersState.data.data)
                        }
                        _charactersDetailsUiState.update { it.copy(isLoading = false, characters = charactersState.data) }
                    }

                    is ResponseState.Error-> {
                        _charactersDetailsUiState.update {
                            it.copy(
                                isLoading = false, errorMessage = charactersState.uiText
                            )
                        }
                    }
                }

            }
            }
        }
    }

