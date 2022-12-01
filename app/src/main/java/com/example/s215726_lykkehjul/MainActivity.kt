package com.example.s215726_lykkehjul

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
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



