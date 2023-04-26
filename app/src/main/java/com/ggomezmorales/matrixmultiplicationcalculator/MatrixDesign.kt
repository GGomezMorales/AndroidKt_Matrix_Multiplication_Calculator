package com.ggomezmorales.matrixmultiplicationcalculator

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ggomezmorales.matrixmultiplicationcalculator.ui.theme.MatrixMultiplicationCalculatorTheme

@Composable
fun Matrix2x2(
    nameMatrix: String
) {
    Column(
        modifier = Modifier
            .fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Matrix $nameMatrix",
            fontSize = 20.sp,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(16.dp)
        )
        Box(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
                .clip(RoundedCornerShape(10))
                .background(
                    color = Color.LightGray,
                    shape = RoundedCornerShape(10)
                )
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .align(Alignment.Center),
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .align(Alignment.CenterHorizontally),

                    ) {
                    EntryComponent(modifier = Modifier.weight(1f))
                    EntryComponent(modifier = Modifier.weight(1f))
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .align(Alignment.CenterHorizontally),
                ) {
                    EntryComponent(modifier = Modifier.weight(1f))
                    EntryComponent(modifier = Modifier.weight(1f))
                }
            }
        }
    }
}

@Composable
fun Matrix3x3(
    nameMatrix: String
) {
    Column(
        modifier = Modifier
            .fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Matrix $nameMatrix",
            fontSize = 20.sp,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(16.dp)
        )
        Box(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
                .clip(RoundedCornerShape(10))
                .background(
                    color = Color.LightGray,
                    shape = RoundedCornerShape(10)
                )
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .align(Alignment.Center),
                verticalArrangement = Arrangement.SpaceBetween
            ) {
                Row(
                    horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                    EntryComponent(modifier = Modifier.weight(1f))
                    EntryComponent(modifier = Modifier.weight(1f))
                    EntryComponent(modifier = Modifier.weight(1f))
                }
                Row(
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    EntryComponent(modifier = Modifier.weight(1f))
                    EntryComponent(modifier = Modifier.weight(1f))
                    EntryComponent(modifier = Modifier.weight(1f))
                }
                Row(
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    EntryComponent(modifier = Modifier.weight(1f))
                    EntryComponent(modifier = Modifier.weight(1f))
                    EntryComponent(modifier = Modifier.weight(1f))
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewComponents() {
    MatrixMultiplicationCalculatorTheme {
        Matrix3x3("A")
    }
}
