package com.example.diff_utils_recyclerview_example.data.mappers

import com.example.diff_utils_recyclerview_example.data.responses.CharacterDataDto
import com.example.diff_utils_recyclerview_example.data.responses.CharactersDto
import com.example.diff_utils_recyclerview_example.domain.models.CharacterDetails
import com.example.diff_utils_recyclerview_example.domain.models.CharacterModel

fun CharactersDto.toDomain() = CharacterModel(
    count = count,
    data = data.map { it.toDomain() }
)

fun CharacterDataDto.toDomain() = CharacterDetails(
    id = id,
    profileImageUrl = imageUrl,
    characterName = name,
)

