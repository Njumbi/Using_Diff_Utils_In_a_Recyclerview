package com.example.diff_utils_recyclerview_example.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.material3.Text
import com.example.diff_utils_recyclerview_example.ui.theme.ComposeUiTheme
import com.example.diff_utils_recyclerview_example.ui.viewmodel.FetchCharactersViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    private val charactersViewModel: FetchCharactersViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeUiTheme {
                Text("Continue")
            }
        }




        charactersViewModel.fetchCharacters.observe(this) {

        }
        charactersViewModel.errorResponse.observe(this) { errorMessage ->

        }
        charactersViewModel.getCharacters()
    }
}