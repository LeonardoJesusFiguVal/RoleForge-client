package com.leonardojsusfig.roleforge_client.views

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import com.leonardojsusfig.roleforge_client.components.MainTopBar
import com.leonardojsusfig.roleforge_client.viewModel.CharactersViewModel

@Composable
fun HomeView(viewModel: CharactersViewModel){
    Scaffold(
        topBar = {MainTopBar(title = "Role Forge") {} }
    ) {
        ContentHomeView(viewModel = viewModel, pad = it)
    }
}

@Composable
fun ContentHomeView(viewModel : CharactersViewModel, pad : PaddingValues){
    val characters by viewModel.characters.collectAsState()
    LazyColumn(
        modifier = Modifier.padding(pad)
    ){
        items(characters) {item->
            Text(text = item.name)

        }
    }
}