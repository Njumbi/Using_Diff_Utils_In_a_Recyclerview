package com.example.diff_utils_recyclerview_example.data.remote


import com.example.diff_utils_recyclerview_example.data.responses.CharactersResponse
import retrofit2.http.GET

interface ApiService {

    @GET("characters")
    suspend fun fetchCharacters(): CharactersResponse

}