package com.ggomezmorales.matrixmultiplicationcalculator

data class CoefficientsMatrix(
    val a: Double?, val b: Double?, val c: Double?, val d: Double?
) {
    fun standartMatrix(): Array<Array<Double?>> {
        val matrix: Array<Array<Double?>> = arrayOf(
            arrayOf(a, b), arrayOf(c, d)
        )
        return matrix
    }
}
