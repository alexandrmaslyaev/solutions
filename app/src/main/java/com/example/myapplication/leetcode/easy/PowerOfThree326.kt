package com.example.myapplication.leetcode.easy

object PowerOfThree326 {
    fun isPowerOfThree(n: Int): Boolean {
        var result = n
        while (result >= 3 && result % 3 == 0) {
            result /= 3
        }
        return result == 1
    }
}