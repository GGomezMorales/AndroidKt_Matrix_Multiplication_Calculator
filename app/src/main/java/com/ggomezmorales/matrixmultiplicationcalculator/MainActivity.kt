package com.ggomezmorales.matrixmultiplicationcalculator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.ggomezmorales.matrixmultiplicationcalculator.ui.theme.MatrixMultiplicationCalculatorTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MatrixMultiplicationCalculatorTheme {
               Matrix3x3("A")
            }
        }
    }
}