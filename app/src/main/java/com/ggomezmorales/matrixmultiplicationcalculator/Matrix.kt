package com.ggomezmorales.matrixmultiplicationcalculator

data class Matrix(
    val a: Double?, val b: Double?, val c: Double?, val d: Double?
) {
    fun getMatrix(): Array<Array<Double?>> {
        return arrayOf(
            arrayOf(a ?: 0.0, b ?: 0.0), arrayOf(c ?: 0.0, d ?: 0.0)
        )
    }
}


