package com.example.diff_utils_recyclerview_example.data.repository

import com.example.diff_utils_recyclerview_example.data.mappers.toDomain
import com.example.diff_utils_recyclerview_example.data.remote.ApiService
import com.example.diff_utils_recyclerview_example.data.remote.ResponseState
import com.example.diff_utils_recyclerview_example.domain.models.CharacterModel
import com.example.diff_utils_recyclerview_example.ui.utils.UiText
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

interface CharactersRepo {
    suspend fun getCharacters(): Flow<ResponseState<CharacterModel>>
}

class CharactersRepoImpl @Inject constructor(private val apiService: ApiService) : CharactersRepo {
    override suspend fun getCharacters() = flow {
        try {
            val characters = apiService.fetchCharacters().toDomain()
            emit(ResponseState.Success(characters))
        } catch (e: Exception) {
            emit(ResponseState.Error(UiText.DynamicText(e.message!!)))
        }
    }
}

