package com.example.s215726_lykkehjul.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.AlertDialog
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.graphics.toColorInt
import com.example.s215726_lykkehjul.R
import com.example.s215726_lykkehjul.ViewModel

@Composable
fun GamePage(viewModel:ViewModel, navigate : () -> Unit){
    val uiState by viewModel.state.collectAsState()
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(color = Color.White))
    {
        Text(
            text = "GÆT ORDET",
            color = Color(titleColor.toColorInt()),
            fontSize = 35.sp,
            fontStyle = FontStyle.Italic,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .offset(y = 100.dp)
                .fillMaxSize()
        )

    }
    Letters(viewModel::guessCharacter)
    Lives(uiState.lives)
    Draw({viewModel.StartNewGame()})
    Category(uiState.category)
    ScoreStatus(uiState.playersScore)
    Button(onClick = navigate,
        colors = ButtonDefaults.buttonColors(backgroundColor = Color.LightGray),
    modifier = Modifier
        .offset(x=150.dp)
        .offset(y=210.dp)
        .height(35.dp)
        .width(101.dp)) {
        Text(text = "Spin igen",
        color = Color.White)
    }
    WordLine(word = uiState.guessSoFar)

    if(uiState.lives < 1){
        AlertDialog(onDismissRequest = {viewModel.StartNewGame() },
            title = {
                Text(text = "Du har tabt")
            },
            confirmButton = {
                Button(onClick = { viewModel.StartNewGame() }) {
                    Text(text = "Spil igen")
                }
            }
        )

    }
    if(uiState.won) {
        AlertDialog(onDismissRequest = {viewModel.StartNewGame() },
            title = {
                Text(text = "Du har vundet")
            },
            confirmButton = {
                Button(onClick = { viewModel.StartNewGame() }) {
                    Text(text = "Spil igen")
                }
            }
        )
    }
}


@Composable
fun WordLine(word : String){
    Row() {
        word.toCharArray().forEach { character ->
            Text(text = character.toString(),
               modifier = Modifier
                    .padding(horizontal = 10.dp)
                    .offset(x = 30.dp)
                    .offset(y = 400.dp),
                fontSize = 20.sp,
            )
        }
    }
}

@Composable
fun Lives(lives : Int) {
    Image(
        painter = painterResource(id = R.drawable.lives),
        contentDescription = "liv",
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .height(30.dp)
            .width(40.dp)
            .offset(y = 530.dp)
            .offset(x = 100.dp)
    )
    Text (
        text = " $lives liv tilbage",
        textAlign = TextAlign.Center,
        color = Color(titleColor.toColorInt()),
        modifier = Modifier
            .offset(y = 540.dp)
            .offset(x = 130.dp)

    )
}

@Composable
fun Draw(onDraw :  () -> Unit){
    Button(onClick = onDraw,
        shape = RoundedCornerShape(60.dp),
        colors = ButtonDefaults.buttonColors(backgroundColor = Color(titleColor.toColorInt())),
        modifier = Modifier
            .offset(x = 120.dp)
            .offset(y = 165.dp)
            .height(35.dp)
            .width(160.dp)
    ) {
        Text(
            text = "TRÆK ET ORD",
            color = Color.White,
            textAlign = TextAlign.Center
        )

    }
}

@Composable
fun Category(category : String) {
    Text(
        text = "Kategorien er: $category ",
        textAlign = TextAlign.Center,
        fontSize = 20.sp,
        color = Color.Gray,
        modifier = Modifier
            .offset(y = 460.dp)
            .offset(x = 90.dp)
    )
}

@Composable
fun ScoreStatus(playersScore : Int){
    Text(
        text = "Points: $playersScore",
        textAlign = TextAlign.Center,
        color = Color(titleColor.toColorInt()),
        modifier = Modifier
            .offset(y = 540.dp)
            .offset(x = 250.dp)
    )
}

@Composable
fun Letters(onPress : (String) -> Unit){
    Button(onClick = {onPress("Q")},
        colors = ButtonDefaults.buttonColors(backgroundColor = Color(titleColor.toColorInt())),
        modifier = Modifier
            .offset(x = 1.dp)
            .offset(y = 600.dp)
            .height(35.dp)
            .width(35.dp)
    ) {
        Text(
            text = "Q",
            color = Color.White,
            textAlign = TextAlign.Center
        )
    }
    Button(onClick = {onPress("W")},
        colors = ButtonDefaults.buttonColors(backgroundColor = Color(titleColor.toColorInt())),
        modifier = Modifier
            .offset(x = 37.dp)
            .offset(y = 600.dp)
            .height(35.dp)
            .width(35.dp)
    ) {
        Text(
            text = "W",
            color = Color.White,
            textAlign = TextAlign.Center
        )
    }
    Button(onClick = {onPress("E")},
        colors = ButtonDefaults.buttonColors(backgroundColor = Color(titleColor.toColorInt())),
        modifier = Modifier
            .offset(x = 73.dp)
            .offset(y = 600.dp)
            .height(35.dp)
            .width(35.dp)
    ) {
        Text(
            text = "E",
            color = Color.White,
            textAlign = TextAlign.Center
        )
    }
    Button(onClick = {onPress("R")},
        colors = ButtonDefaults.buttonColors(backgroundColor = Color(titleColor.toColorInt())),
        modifier = Modifier
            .offset(x = 109.dp)
            .offset(y = 600.dp)
            .height(35.dp)
            .width(35.dp)
    ) {
        Text(
            text = "R",
            color = Color.White,
            textAlign = TextAlign.Center
        )
    }
    Button(onClick = {onPress("T")},
        colors = ButtonDefaults.buttonColors(backgroundColor = Color(titleColor.toColorInt())),
        modifier = Modifier
            .offset(x = 145.dp)
            .offset(y = 600.dp)
            .height(35.dp)
            .width(35.dp)
    ) {
        Text(
            text = "T",
            color = Color.White,
            textAlign = TextAlign.Center
        )
    }
    Button(onClick = {onPress("Y")},
        colors = ButtonDefaults.buttonColors(backgroundColor = Color(titleColor.toColorInt())),
        modifier = Modifier
            .offset(x = 181.dp)
            .offset(y = 600.dp)
            .height(35.dp)
            .width(35.dp)
    ) {
        Text(
            text = "Y",
            color = Color.White,
            textAlign = TextAlign.Center
        )
    }
    Button(onClick = {onPress("U")},
        colors = ButtonDefaults.buttonColors(backgroundColor = Color(titleColor.toColorInt())),
        modifier = Modifier
            .offset(x = 217.dp)
            .offset(y = 600.dp)
            .height(35.dp)
            .width(35.dp)
    ) {
        Text(
            text = "U",
            color = Color.White,
            textAlign = TextAlign.Center
        )
    }
    Button(onClick = {onPress("I")},
        colors = ButtonDefaults.buttonColors(backgroundColor = Color(titleColor.toColorInt())),
        modifier = Modifier
            .offset(x = 253.dp)
            .offset(y = 600.dp)
            .height(35.dp)
            .width(35.dp)
    ) {
        Text(
            text = "I",
            color = Color.White,
            textAlign = TextAlign.Center
        )
    }
    Button(onClick = {onPress("O")},
        colors = ButtonDefaults.buttonColors(backgroundColor = Color(titleColor.toColorInt())),
        modifier = Modifier
            .offset(x = 289.dp)
            .offset(y = 600.dp)
            .height(35.dp)
            .width(35.dp)
    ) {
        Text(
            text = "O",
            color = Color.White,
            textAlign = TextAlign.Center
        )
    }
    Button(onClick = {onPress("P")},
        colors = ButtonDefaults.buttonColors(backgroundColor = Color(titleColor.toColorInt())),
        modifier = Modifier
            .offset(x = 325.dp)
            .offset(y = 600.dp)
            .height(35.dp)
            .width(35.dp)
    ) {
        Text(
            text = "P",
            color = Color.White,
            textAlign = TextAlign.Center
        )
    }
    Button(onClick = {onPress("Å")},
        colors = ButtonDefaults.buttonColors(backgroundColor = Color(titleColor.toColorInt())),
        modifier = Modifier
            .offset(x = 361.dp)
            .offset(y = 600.dp)
            .height(35.dp)
            .width(35.dp)
    ) {
        Text(
            text = "Å",
            color = Color.White,
            textAlign = TextAlign.Center
        )
    }
    Button(onClick = {onPress("A")},
        colors = ButtonDefaults.buttonColors(backgroundColor = Color(titleColor.toColorInt())),
        modifier = Modifier
            .offset(x = 1.dp)
            .offset(y = 650.dp)
            .height(35.dp)
            .width(35.dp)
    ) {
        Text(
            text = "A",
            color = Color.White,
            textAlign = TextAlign.Center
        )

    }
    Button(onClick = {onPress("S")},
        colors = ButtonDefaults.buttonColors(backgroundColor = Color(titleColor.toColorInt())),
        modifier = Modifier
            .offset(x = 37.dp)
            .offset(y = 650.dp)
            .height(35.dp)
            .width(35.dp)
    ) {
        Text(
            text = "S",
            color = Color.White,
            textAlign = TextAlign.Center
        )
    }
    Button(onClick = {onPress("D")},
        colors = ButtonDefaults.buttonColors(backgroundColor = Color(titleColor.toColorInt())),
        modifier = Modifier
            .offset(x = 73.dp)
            .offset(y = 650.dp)
            .height(35.dp)
            .width(35.dp)
    ) {
        Text(
            text = "D",
            color = Color.White,
            textAlign = TextAlign.Center
        )
    }
    Button(onClick = {onPress("F")},
        colors = ButtonDefaults.buttonColors(backgroundColor = Color(titleColor.toColorInt())),
        modifier = Modifier
            .offset(x = 109.dp)
            .offset(y = 650.dp)
            .height(35.dp)
            .width(35.dp)
    ) {
        Text(
            text = "F",
            color = Color.White,
            textAlign = TextAlign.Center
        )
    }
    Button(onClick = {onPress("G")},
        colors = ButtonDefaults.buttonColors(backgroundColor = Color(titleColor.toColorInt())),
        modifier = Modifier
            .offset(x = 145.dp)
            .offset(y = 650.dp)
            .height(35.dp)
            .width(35.dp)
    ) {
        Text(
            text = "G",
            color = Color.White,
            textAlign = TextAlign.Center
        )
    }
    Button(onClick = {onPress("H")},
        colors = ButtonDefaults.buttonColors(backgroundColor = Color(titleColor.toColorInt())),
        modifier = Modifier
            .offset(x = 181.dp)
            .offset(y = 650.dp)
            .height(35.dp)
            .width(35.dp)
    ) {
        Text(
            text = "H",
            color = Color.White,
            textAlign = TextAlign.Center
        )
    }
    Button(onClick = {onPress("J")},
        colors = ButtonDefaults.buttonColors(backgroundColor = Color(titleColor.toColorInt())),
        modifier = Modifier
            .offset(x = 217.dp)
            .offset(y = 650.dp)
            .height(35.dp)
            .width(35.dp)
    ) {
        Text(
            text = "J",
            color = Color.White,
            textAlign = TextAlign.Center
        )
    }
    Button(onClick = {onPress("K")},
        colors = ButtonDefaults.buttonColors(backgroundColor = Color(titleColor.toColorInt())),
        modifier = Modifier
            .offset(x = 253.dp)
            .offset(y = 650.dp)
            .height(35.dp)
            .width(35.dp)
    ) {
        Text(
            text = "K",
            color = Color.White,
            textAlign = TextAlign.Center
        )
    }
    Button(onClick = {onPress("L")},
        colors = ButtonDefaults.buttonColors(backgroundColor = Color(titleColor.toColorInt())),
        modifier = Modifier
            .offset(x = 289.dp)
            .offset(y = 650.dp)
            .height(35.dp)
            .width(35.dp)
    ) {
        Text(
            text = "L",
            color = Color.White,
            textAlign = TextAlign.Center
        )
    }
    Button(onClick = {onPress("Æ")},
        colors = ButtonDefaults.buttonColors(backgroundColor = Color(titleColor.toColorInt())),
        modifier = Modifier
            .offset(x = 325.dp)
            .offset(y = 650.dp)
            .height(35.dp)
            .width(35.dp)
    ) {
        Text(
            text = "Æ",
            color = Color.White,
            textAlign = TextAlign.Center
        )
    }
    Button(onClick = {onPress("Ø")},
        colors = ButtonDefaults.buttonColors(backgroundColor = Color(titleColor.toColorInt())),
        modifier = Modifier
            .offset(x = 361.dp)
            .offset(y = 650.dp)
            .height(35.dp)
            .width(35.dp)
    ) {
        Text(
            text = "Ø",
            color = Color.White,
            textAlign = TextAlign.Center
        )
    }
    Button(onClick = {onPress("Z")},
        colors = ButtonDefaults.buttonColors(backgroundColor = Color(titleColor.toColorInt())),
        modifier = Modifier
            .offset(x = 73.dp)
            .offset(y = 700.dp)
            .height(35.dp)
            .width(35.dp)
    ) {
        Text(
            text = "Z",
            color = Color.White,
            textAlign = TextAlign.Center
        )
    }
    Button(onClick = {onPress("X")},
        colors = ButtonDefaults.buttonColors(backgroundColor = Color(titleColor.toColorInt())),
        modifier = Modifier
            .offset(x = 109.dp)
            .offset(y = 700.dp)
            .height(35.dp)
            .width(35.dp)
    ) {
        Text(
            text = "X",
            color = Color.White,
            textAlign = TextAlign.Center
        )
    }
    Button(onClick = {onPress("C")},
        colors = ButtonDefaults.buttonColors(backgroundColor = Color(titleColor.toColorInt())),
        modifier = Modifier
            .offset(x = 145.dp)
            .offset(y = 700.dp)
            .height(35.dp)
            .width(35.dp)
    ) {
        Text(
            text = "C",
            color = Color.White,
            textAlign = TextAlign.Center
        )
    }
    Button(onClick = {onPress("V")},
        colors = ButtonDefaults.buttonColors(backgroundColor = Color(titleColor.toColorInt())),
        modifier = Modifier
            .offset(x = 181.dp)
            .offset(y = 700.dp)
            .height(35.dp)
            .width(35.dp)
    ) {
        Text(
            text = "V",
            color = Color.White,
            textAlign = TextAlign.Center
        )
    }
    Button(onClick = {onPress("B")},
        colors = ButtonDefaults.buttonColors(backgroundColor = Color(titleColor.toColorInt())),
        modifier = Modifier
            .offset(x = 217.dp)
            .offset(y = 700.dp)
            .height(35.dp)
            .width(35.dp)
    ) {
        Text(
            text = "B",
            color = Color.White,
            textAlign = TextAlign.Center
        )
    }
    Button(onClick = {onPress("N")},
        colors = ButtonDefaults.buttonColors(backgroundColor = Color(titleColor.toColorInt())),
        modifier = Modifier
            .offset(x = 253.dp)
            .offset(y = 700.dp)
            .height(35.dp)
            .width(35.dp)
    ) {
        Text(
            text = "N",
            color = Color.White,
            textAlign = TextAlign.Center
        )
    }
    Button(onClick = {onPress("M")},
        colors = ButtonDefaults.buttonColors(backgroundColor = Color(titleColor.toColorInt())),
        modifier = Modifier
            .offset(x = 289.dp)
            .offset(y = 700.dp)
            .height(35.dp)
            .width(35.dp)
    ) {
        Text(
            text = "M",
            color = Color.White,
            textAlign = TextAlign.Center
        )
    }
}

