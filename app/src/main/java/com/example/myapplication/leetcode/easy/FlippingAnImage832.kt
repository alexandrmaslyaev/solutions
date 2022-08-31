package com.example.myapplication.leetcode.easy

object FlippingAnImage832 {
    fun flipAndInvertImage(image: Array<IntArray>): Array<IntArray> {
        val result = mutableListOf<List<Int>>()
        image.forEach { array ->
            result.add(
                array.reversed().map { int -> if (int == 0) 1 else 0 })
        }
        return result.map { it.toIntArray() }.toTypedArray()
    }
}