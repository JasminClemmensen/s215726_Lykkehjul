package com.example.s215726_lykkehjul

data class UiState(
    val playersScore : Int = 0,
    val lives : Int = 5,
    var wordToGuess : String = "",
    val guessSoFar : String = "",
    var category : String = "",
    var wheelField : Int = 0,
    var valueField : Int = 0
)
