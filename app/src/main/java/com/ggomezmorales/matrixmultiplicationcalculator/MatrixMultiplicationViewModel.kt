package com.ggomezmorales.matrixmultiplicationcalculator

class MatrixMultiplicationViewModel {

    fun strassenMethod2X2(
        A: CoefficientsMatrix, B: CoefficientsMatrix
    ): Array<Array<Double>> {
        val p1 = (A.a!! + A.d!!) * (B.a!! + B.d!!)
        val p2 = (A.c!! + A.d) * (B.a)
        val p3 = (A.a) * (B.b!! - B.d)
        val p4 = (A.d) * (-B.a + B.c!!)
        val p5 = (A.a + A.b!!) * (B.d)
        val p6 = (-A.a + A.c) * (B.a + B.b)
        val p7 = (A.b - A.d) * (B.c + B.d)

        return arrayOf(
            arrayOf(
                p1 + p4 - p5 + p7, p3 + p5
            ), arrayOf(
                p2 + p4, p1 - p2 + p3 + p6
            )
        )
    }
}