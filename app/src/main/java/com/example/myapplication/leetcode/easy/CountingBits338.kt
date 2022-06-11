package com.example.myapplication.leetcode.easy

object CountingBits338 {
    fun countBits(n: Int): IntArray {
        val result = mutableListOf<Int>()
        for (i in 0..n) {
            result.add(Integer.toBinaryString(i).count { it == '1' })
        }
        return result.toIntArray()
    }
}