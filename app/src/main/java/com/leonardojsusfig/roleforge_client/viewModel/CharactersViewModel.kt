package com.leonardojsusfig.roleforge_client.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.leonardojsusfig.roleforge_client.model.CharList
import com.leonardojsusfig.roleforge_client.repository.CharacterRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import okhttp3.MediaType
import okhttp3.RequestBody
import javax.inject.Inject

@HiltViewModel
class CharactersViewModel @Inject constructor(private val repo: CharacterRepository) : ViewModel() {

    private val _characters = MutableStateFlow<List<CharList>> (emptyList())
    val characters = _characters.asStateFlow()
    init {
        fetchCharacters()
    }

    private fun fetchCharacters() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {

                //Por ahora pondre una id de prueba
                val request = "664a5e2b84ba91c7ede35b52"

                val result = repo.getCharacters(request)
                _characters.value = result ?: emptyList()
            }
        }
    }
}