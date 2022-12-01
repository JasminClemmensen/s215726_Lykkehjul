package com.example.s215726_lykkehjul

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.s215726_lykkehjul.ui.theme.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Navigation(ViewModel())

        }
    }
}

@Composable
fun Navigation(viewModel: ViewModel) {
    var guess = remember {
        mutableStateOf(true)
    }
    if(guess.value) {
        StartPage(viewModel = viewModel, {guess.value = false})
    } else {
        GamePage(viewModel = viewModel, {guess.value = true})
    }
}



