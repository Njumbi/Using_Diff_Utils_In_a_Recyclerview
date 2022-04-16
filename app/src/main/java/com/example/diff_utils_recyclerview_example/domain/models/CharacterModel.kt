package com.example.diff_utils_recyclerview_example.domain.models


data class CharacterModel(
    val count: Int?,
    val data:List<CharacterDetails>
)

data class CharacterDetails(
    val id: Int?,
    val profileImageUrl: String?,
    val characterName: String?,
)