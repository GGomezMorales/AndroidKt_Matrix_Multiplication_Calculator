package com.ggomezmorales.matrixmultiplicationcalculator

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun EntryComponent(
    modifier: Modifier = Modifier
) {
    val inputNumber = remember{ mutableStateOf("") }
    TextField(
        value = inputNumber.value,
        onValueChange = {
            inputNumber.value = it
        },
        modifier = Modifier
            .padding(6.dp)
            .clip(RoundedCornerShape(15))
            .border(
                width = 3.dp,
                color = Color.LightGray,
                shape = RoundedCornerShape(15)
            )
            .background(
                color = Color.Transparent,
                shape = RoundedCornerShape(15)
            )
            .then(modifier),
        keyboardOptions = KeyboardOptions(
            keyboardType = KeyboardType.Number
        ),
        textStyle = TextStyle.Default.copy(
            fontSize = 20.sp,
            color = Color.White,
            textAlign = TextAlign.Center
        ),
        colors = TextFieldDefaults.textFieldColors(
            containerColor = Color(0xFF999999)
            ),
    )
}