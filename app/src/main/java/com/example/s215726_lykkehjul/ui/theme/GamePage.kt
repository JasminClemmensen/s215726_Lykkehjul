package com.example.s215726_lykkehjul.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.SnackbarDefaults.backgroundColor
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.graphics.toColorInt
import com.example.s215726_lykkehjul.R

@Composable
fun GamePage(){
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
    Letters()
    Lives()
    Draw()

}

@Composable
fun Lives() {
    Image(
        painter = painterResource(id = R.drawable.lives),
        contentDescription = "liv",
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .height(30.dp)
            .width(40.dp)
            .offset(y = 530.dp)
            .offset(x = 140.dp)
    )
    Text (
        text = " 5 liv tilbage",
        textAlign = TextAlign.Center,
        color = Color(titleColor.toColorInt()),
        modifier = Modifier
            .offset(y = 540.dp)
            .offset(x = 175.dp)

    )
}

@Composable
fun Draw(){
    Button(onClick = {},
        colors = ButtonDefaults.buttonColors(backgroundColor = Color.LightGray),
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
fun Letters(){
    Button(onClick = {
    },
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
    Button(onClick = {
    },
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
    Button(onClick = {
    },
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
    Button(onClick = {
    },
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
    Button(onClick = {
    },
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
    Button(onClick = {
    },
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
    Button(onClick = {
    },
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
    Button(onClick = {
    },
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
    Button(onClick = {
    },
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
    Button(onClick = {
    },
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
    Button(onClick = {
    },
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
    Button(onClick = {
    },
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
    Button(onClick = {
    },
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
    Button(onClick = {
    },
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
    Button(onClick = {
    },
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
    Button(onClick = {
    },
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
    Button(onClick = {
    },
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
    Button(onClick = {
    },
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
    Button(onClick = {
    },
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
    Button(onClick = {
    },
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
    Button(onClick = {
    },
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
    Button(onClick = {
    },
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
    Button(onClick = {
    },
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
    Button(onClick = {
    },
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
    Button(onClick = {
    },
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
    Button(onClick = {
    },
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
    Button(onClick = {
    },
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
    Button(onClick = {
    },
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
    Button(onClick = {
    },
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

