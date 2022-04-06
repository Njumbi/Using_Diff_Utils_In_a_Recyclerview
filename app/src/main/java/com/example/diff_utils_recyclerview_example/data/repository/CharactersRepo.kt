package com.example.diff_utils_recyclerview_example.data.repository

import android.util.Log
import com.example.diff_utils_recyclerview_example.data.remote.ApiService
import com.example.diff_utils_recyclerview_example.data.responses.ApiResource
import com.example.diff_utils_recyclerview_example.data.responses.CharactersResponse
import com.example.diff_utils_recyclerview_example.data.responses.DataResponse
import com.example.diff_utils_recyclerview_example.data.responses.safeApiCall
import java.lang.reflect.Constructor
import javax.inject.Inject

interface CharactersRepo{
    suspend fun getCharacters(): ApiResource<CharactersResponse>
}
class CharactersRepoImpl @Inject constructor(val apiService: ApiService):CharactersRepo{
    override suspend fun getCharacters() = safeApiCall {
        apiService.fetchCharacters()
    }

}