package com.example.myapplication.leetcode.easy

object PowerOfTwo231 {
    fun isPowerOfTwo(n: Int): Boolean {
        var input = n
        while (input >= 2) {
            if (input % 2 == 0) {
                input /= 2
            } else {
                return false
            }
        }
        return input == 1
    }
}