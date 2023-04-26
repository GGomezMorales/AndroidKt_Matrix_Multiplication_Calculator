package com.ggomezmorales.matrixmultiplicationcalculator

class MatrixMultiplicationViewModel {

    private fun strassensMethod2x2(
        A: Matrix, B: Matrix
    ): Array<Array<Double>> {
        val p1: Double = ((A.a ?: 0.0) + (A.d ?: 0.0)) * ((B.a ?: 0.0) + (B.d ?: 0.0))
        val p2: Double = ((A.c ?: 0.0) + (A.d ?: 0.0)) * (B.a ?: 0.0)
        val p3: Double = (A.a ?: 0.0) * ((B.b ?: 0.0) - (B.d ?: 0.0))
        val p4: Double = (A.d ?: 0.0) * (-(B.a ?: 0.0) + (B.c ?: 0.0))
        val p5: Double = ((A.a ?: 0.0) + (A.b ?: 0.0)) * (B.d ?: 0.0)
        val p6: Double = (-(A.a ?: 0.0) + (A.c ?: 0.0)) * ((B.a ?: 0.0) + (B.b ?: 0.0))
        val p7: Double = ((A.b ?: 0.0) - (A.d ?: 0.0)) * ((B.c ?: 0.0) + (B.d ?: 0.0))

        return arrayOf(
            arrayOf(
                (p1 + p4 - p5 + p7), (p3 + p5)
            ), arrayOf(
                (p2 + p4), (p1 - p2 + p3 + p6)
            )
        )
    }

    private fun strassensMethod4x4(
        A: Matrix, B: Matrix, C: Matrix, D: Matrix,
        E: Matrix, F: Matrix, G: Matrix, H: Matrix
    ): Array<Array<Double>> {
        val matrixAE = strassensMethod2x2(A, E)
        val matrixBG = strassensMethod2x2(B, G)
        val matrixAF = strassensMethod2x2(A, F)
        val matrixBH = strassensMethod2x2(B, H)
        val matrixCE = strassensMethod2x2(C, E)
        val matrixDG = strassensMethod2x2(D, G)
        val matrixCF = strassensMethod2x2(C, F)
        val matrixDH = strassensMethod2x2(D, H)

        val matrixX = addMatrix2x2(matrixAE, matrixBG)
        val matrixY = addMatrix2x2(matrixAF, matrixBH)
        val matrixZ = addMatrix2x2(matrixCE, matrixDG)
        val matrixW = addMatrix2x2(matrixCF, matrixDH)

        return arrayOf(
            arrayOf(matrixX[0][0], matrixX[0][1], matrixY[0][0], matrixY[0][1]),
            arrayOf(matrixX[1][0], matrixX[1][1], matrixY[1][0], matrixY[1][1]),
            arrayOf(matrixZ[0][0], matrixZ[0][1], matrixW[0][0], matrixW[0][1]),
            arrayOf(matrixZ[1][0], matrixZ[1][1], matrixW[1][0], matrixW[1][1])
        )
    }

    private fun addMatrix2x2(A: Array<Array<Double>>, B: Array<Array<Double>>): Array<Array<Double>> {
        val result: Array<Array<Double>> = Array(2) { Array(2) {0.0}  }

        for (i in 0..A.size) {
            for (j in 0..A[0].size) {
                result[i][j] = (A[i][j] + B[i][j])
            }
        }
        return result
    }

}

