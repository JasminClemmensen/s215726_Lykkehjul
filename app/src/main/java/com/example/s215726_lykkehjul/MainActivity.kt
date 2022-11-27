package com.example.s215726_lykkehjul

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.s215726_lykkehjul.ui.theme.GamePage
import com.example.s215726_lykkehjul.ui.theme.S215726_LykkehjulTheme
import com.example.s215726_lykkehjul.ui.theme.StartPage

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            //StartPage()
            GamePage()
                }
            }
        }



