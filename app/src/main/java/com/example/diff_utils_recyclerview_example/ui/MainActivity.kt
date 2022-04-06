package com.example.diff_utils_recyclerview_example.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.diff_utils_recyclerview_example.databinding.ActivityMainBinding
import com.example.diff_utils_recyclerview_example.ui.adapters.CharactersAdapter
import com.example.diff_utils_recyclerview_example.ui.viewmodel.fetchCharactersViewModel
import com.google.android.material.snackbar.Snackbar
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var charactersAdapter: CharactersAdapter
    private val charactersViewModel: fetchCharactersViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        charactersAdapter = CharactersAdapter()
        var recyclerView = binding.rvCharacters
        recyclerView.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        recyclerView.adapter = charactersAdapter

        charactersViewModel.fetchCharacters.observe(this) {
            charactersAdapter.saveData(it.data)
        }
        charactersViewModel.errorResponse.observe(this) { errorMessage ->
            Snackbar.make(binding.root, errorMessage.toString(), Snackbar.LENGTH_SHORT).show()
        }
        charactersViewModel.getCharacters()
    }
}