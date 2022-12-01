package com.example.s215726_lykkehjul

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlin.random.Random


class ViewModel() : ViewModel() {
    val _state = MutableStateFlow(UiState())
    val state = _state.asStateFlow()

    fun StartNewGame() {
        DrawWord()
        _state.update { currentState ->
            currentState.copy(
                playersScore = 0,
                lives = 5,
                won = false
            )
        }
    }


    private fun DrawWord() {
        var category: String = ""
        var wordToGuess: String = ""
        val Index: Int = Random.nextInt(0, words.size)
        val builder = StringBuilder()
        if (Index <= 26) {
            category = "LAND"
        } else if (Index <= 35) {
            category = "DYR"
        } else {
            category = "SPORT"
        }
        wordToGuess = words[Index]
        for (i in 1..wordToGuess.length) {
            builder.append("_")
        }
        _state.update { currentState ->
            currentState.copy(
                wordToGuess = wordToGuess,
                category = category,
                guessSoFar = builder.toString()
            )
        }

    }


    fun spinWheel() {
        if(_state.value.valueField != 0)
            return
        val valueField = (1..8).random()
        val wheelField = when (valueField) {
            1 -> R.drawable.lykkehjul
            2 -> R.drawable.lykkehjul2
            3 -> R.drawable.lykkehjul3
            4 -> R.drawable.lykkehjul4
            5 -> R.drawable.lykkehjul5
            6 -> R.drawable.lykkehjul6
            7 -> R.drawable.lykkehjul7
            else -> R.drawable.lykkehjul8
        }
        _state.update {
            it.copy(
                wheelField = wheelField,
                valueField = valueField
            )
        }
        if(valueField == 1) {
            _state.update {
                it.copy(playersScore = 0)
            }
        }
    }

    fun updateScore() {
        val newScore = when (_state.value.valueField) {
            1 -> 0
            2 -> 1000
            3 -> 1000
            4 -> 2000
            5 -> 500
            6 -> 200
            7 -> 500
            else -> 200
        }
        if (newScore == 0) {
            _state.update {
                it.copy(
                    playersScore = 0
                )
            }
        }
        _state.update {
            it.copy(
                playersScore = it.playersScore + newScore
            )
        }
    }

    fun guessCharacter(newCharacter: String) {
        if(_state.value.valueField == 0)
            return
        val word = _state.value.wordToGuess
        var guessCorrect = false
        for (i in word.indices) {
            if(newCharacter[0] == word[i]){
                guessCorrect = true
                updateScore()
                _state.update {
                    val newGuess = it.guessSoFar.substring(0, i) + newCharacter + it.guessSoFar.substring(i+1)
                    it.copy(
                        guessSoFar = newGuess
                    )
                }
            }
        }

        if(!guessCorrect){
            _state.update {
                it.copy(
                    lives = it.lives -1
                )
            }
        }

        if (won()) {
            _state.update {
                it.copy(
                    won = true
                )
            }
        }
        _state.update {
            it.copy(valueField = 0)
        }
    }


    fun won() : Boolean {
       return !_state.value.guessSoFar.contains("_")
    }
}

