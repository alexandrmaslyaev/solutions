package com.example.myapplication.leetcode.easy

object TransposeMatrix867 {
    fun transpose(matrix: Array<IntArray>): Array<IntArray> {
        val result: Array<IntArray> = Array(matrix[0].size) { IntArray(matrix.size) { 0 } }
        for (i in 0 until matrix[0].size) {
            for (j in matrix.indices) {
                result[i][j] = matrix[j][i]
            }
        }
        return result
    }
}
