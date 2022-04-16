package com.example.diff_utils_recyclerview_example.data.repository

import com.example.diff_utils_recyclerview_example.data.mappers.toDomain
import com.example.diff_utils_recyclerview_example.data.remote.ApiService
import com.example.diff_utils_recyclerview_example.data.responses.ApiResource
import com.example.diff_utils_recyclerview_example.data.responses.safeApiCall
import com.example.diff_utils_recyclerview_example.domain.models.CharacterModel
import javax.inject.Inject

interface CharactersRepo{
    suspend fun getCharacters(): ApiResource<CharacterModel>
}
class CharactersRepoImpl @Inject constructor(val apiService: ApiService):CharactersRepo{
    override suspend fun getCharacters() = safeApiCall {
        apiService.fetchCharacters().toDomain()
    }

}