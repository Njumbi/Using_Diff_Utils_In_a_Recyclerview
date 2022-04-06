package com.example.diff_utils_recyclerview_example.data.responses

data class CharactersResponse(
    val count: Int,
    val `data`: List<DataResponse>,
    val nextPage: String,
    val totalPages: Int
)

data class DataResponse(
    var id: Int,
    val allies: List<Any>,
    val enemies: List<Any>,
    val films: List<Any>,
    val imageUrl: String,
    val name: String,
    val parkAttractions: List<Any>,
    val shortFilms: List<Any>,
    val tvShows: List<Any>,
    val url: String,
    val videoGames: List<Any>
)


