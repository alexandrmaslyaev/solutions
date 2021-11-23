package com.example.myapplication.leetcode.easy

class ReshapeTheMatrix566 {
    fun matrixReshape(mat: Array<IntArray>, r: Int, c: Int): Array<IntArray> {
        val list = mutableListOf<Int>()
        val result = mutableListOf<IntArray>()
        if (r * c != mat.size * mat.first().size) return mat
        else {
            mat.forEach { array ->
                array.forEach { item ->
                    list.add(item)
                }
            }
            var counter = 0
            for (i in 0 until r) {
                val iList = mutableListOf<Int>()
                for (j in 0 until c) {
                    iList.add(list[counter])
                    counter++
                }
                result.add(iList.toIntArray())
            }
        }
        return result.toTypedArray()
    }
}