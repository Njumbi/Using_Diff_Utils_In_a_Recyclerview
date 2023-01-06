package com.example.diff_utils_recyclerview_example.ui.state

import com.example.diff_utils_recyclerview_example.domain.models.CharacterDetails
import com.example.diff_utils_recyclerview_example.domain.models.CharacterModel
import com.example.diff_utils_recyclerview_example.ui.utils.UiText

/**
 * It's a data class that holds the state of the UI.
 * @property {Boolean} isLoading - This is a boolean property that indicates whether the data is being
 * loaded or not.
 * @property {UiText?} errorMessage - This is a UiText object that will be used to display an error
 * message to the user.
 * @property {List<CharacterModel>?} songs - This is the list of songs that will be displayed in the
 * UI.
 */
data class CharactersDetailsUiState(
    val isLoading: Boolean = false,
    val errorMessage: UiText? = null,
    val characters: CharacterModel?= null
)