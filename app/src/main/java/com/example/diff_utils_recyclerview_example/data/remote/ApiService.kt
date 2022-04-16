package com.example.diff_utils_recyclerview_example.data.remote


import com.example.diff_utils_recyclerview_example.data.responses.CharactersDto
import retrofit2.http.GET

interface ApiService {

    @GET("characters")
    suspend fun fetchCharacters(): CharactersDto

}