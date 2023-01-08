package com.example.diff_utils_recyclerview_example.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi
import com.bumptech.glide.integration.compose.GlideImage
import com.example.diff_utils_recyclerview_example.R
import com.example.diff_utils_recyclerview_example.domain.models.CharacterDetails
import com.example.diff_utils_recyclerview_example.ui.theme.ComposeUiTheme
import com.example.diff_utils_recyclerview_example.ui.theme.black
import com.example.diff_utils_recyclerview_example.ui.theme.grey
import com.example.diff_utils_recyclerview_example.ui.theme.white
import com.example.diff_utils_recyclerview_example.ui.viewmodel.FetchCharactersViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    private val charactersViewModel: FetchCharactersViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeUiTheme {
                CharactersList()
            }
        }


    }

    @OptIn(ExperimentalMaterial3Api::class, ExperimentalGlideComposeApi::class)
    @Composable
    private fun CharactersList(
        modifier: Modifier = Modifier
    ) {

        val charactersUiState = charactersViewModel.charactersDetailsUiState.collectAsState()

        val characters = charactersUiState.value.characters
        val errorMessage = charactersUiState.value.errorMessage
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(white)
        ) {
            errorMessage?.let {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp)
                ) {
                    Text(
                        text = errorMessage.asString(LocalContext.current),
                        style = MaterialTheme.typography.displaySmall.copy(fontSize = 13.sp),
                        color = MaterialTheme.colorScheme.onSurface
                    )
                }
            }
            if (characters?.data?.isNotEmpty() == true) LazyColumn(
                modifier = modifier.padding(
                    vertical = 4.dp
                )
            ) {
                items(items = characters.data) { character ->
                    Surface(
                        color = white,
                        modifier = Modifier.padding(vertical = 4.dp, horizontal = 8.dp)
                    ) {
                        Card(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(8.dp),
                            elevation = CardDefaults.cardElevation(
                                defaultElevation = 10.dp
                            ),
                            colors = CardDefaults.cardColors(
                                containerColor = white,
                            ),

                            ) {
                            Row(
                                modifier = Modifier.padding(
                                    vertical = 8.dp, horizontal = 8.dp
                                )
                            ) {
                                if (character.profileImageUrl?.isNotBlank() == true) {
                                    GlideImage(
                                        model = character.profileImageUrl,
                                        contentDescription = null,
                                        contentScale = ContentScale.Crop,
                                        modifier = Modifier
                                            .size(100.dp)
                                            .clip(CircleShape)
                                            .border(2.dp, grey, CircleShape)

                                    )
                                }
                                Spacer(modifier = Modifier.width(10.dp))
                                Text(
                                    modifier = Modifier
                                        .align(Alignment.CenterVertically)
                                        .padding(horizontal = 5.dp),
                                    color = black,
                                    fontSize = 18.sp,
                                    text = character.characterName.toString()
                                )
                            }
                        }
                    }
                }
            }

        }

    }


    /*  @Preview
      @Composable
      fun charactersScreenPreview() {
          ComposeUiTheme {
              CharactersList()
          }
      }*/
}