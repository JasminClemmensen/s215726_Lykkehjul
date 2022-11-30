package com.example.s215726_lykkehjul.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
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


val titleColor = "#FA7F72"
@Composable
fun StartPage(viewModel: ViewModel, navigate : () -> Unit) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(color = Color.White))
    {
        Text(
            text = "LYKKEHJULET",
            color = Color(titleColor.toColorInt()),
            fontSize = 35.sp,
            fontStyle = FontStyle.Italic,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .offset(y = 100.dp)
                .fillMaxSize()
        )
        Wheel()
        Spin({viewModel.spinWheel()})
        Button(onClick = navigate) {
            Text(text = "Gæt ordet")
        }
    }

}


@Composable
fun Wheel() {
    Image(
        painter = painterResource(id = R.drawable.lykkehjul),
        contentDescription = "lykkehjul",
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .height(400.dp)
            .width(400.dp)
            .offset(y = 200.dp)
            .offset(x = 7.dp)
    )
}

@Composable
fun Spin(onSpin: () -> Unit){
    Button(onClick = onSpin,
        shape = RoundedCornerShape(60.dp),
        colors = ButtonDefaults.buttonColors(backgroundColor = Color(titleColor.toColorInt())),
        modifier = Modifier
            .offset(x = 134.dp)
            .offset(y = 630.dp)
    ) {
        Text(
            text = "SPIN HJULET",
            color = Color.White
        )

    }
}