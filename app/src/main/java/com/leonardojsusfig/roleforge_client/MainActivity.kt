package com.leonardojsusfig.roleforge_client

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.leonardojsusfig.roleforge_client.ui.theme.RoleForge_clientTheme
import com.leonardojsusfig.roleforge_client.viewModel.CharactersViewModel
import com.leonardojsusfig.roleforge_client.views.HomeView
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val viewModel : CharactersViewModel by viewModels()
        setContent {
            RoleForge_clientTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    HomeView(viewModel = viewModel)
                }
            }
        }
    }
}