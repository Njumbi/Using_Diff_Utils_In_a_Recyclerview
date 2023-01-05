package com.example.diff_utils_recyclerview_example.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.diff_utils_recyclerview_example.R
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
                charactersListScreen()
            }
        }


    }

    @Composable
    private fun charactersListScreen() {

    }

    @Composable
    private fun CharactersList(characters: List<String>, modifier: Modifier = Modifier) {
        LazyColumn(modifier = modifier.padding(vertical = 4.dp)) {
            items(items = characters) { character ->
                CharacterCard(character)

            }
        }
    }

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    private fun CharacterCard(character: String) {
        Surface(
            color = white,
            modifier = Modifier.padding(vertical = 4.dp, horizontal = 8.dp)
        ) {
            Card(
                modifier = Modifier.fillMaxWidth().padding(8.dp),
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 10.dp
                ),
                colors = CardDefaults.cardColors(
                    containerColor = white,
                ),

                )
            {
                Row(
                    modifier = Modifier.padding(vertical = 8.dp, horizontal = 8.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.screenshot),
                        contentDescription = null,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(100.dp)
                            .clip(CircleShape)
                            .border(2.dp, grey, CircleShape)
                    )
                    Spacer(modifier = Modifier.width(10.dp))
                    Text(
                        modifier = Modifier.align(Alignment.CenterVertically).padding(horizontal = 5.dp),
                        color = black,
                        fontSize = 18.sp,
                        text = "Welcome")
                }


            }
        }
    }

    @Preview
    @Composable
    fun charactersScreenPreview() {
        ComposeUiTheme {
            CharacterCard(character = String())
        }
    }
}