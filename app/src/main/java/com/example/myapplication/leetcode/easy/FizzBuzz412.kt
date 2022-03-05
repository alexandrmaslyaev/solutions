package com.example.myapplication.leetcode.easy

object FizzBuzz412 {
    fun fizzBuzz(n: Int): List<String> {
        val result = Array(size = n) { "" }
        (1..n).forEach {
            when {
                it % 3 == 0 && it % 5 == 0 -> result[it - 1] = "FizzBuzz"
                it % 3 == 0 -> result[it - 1] = "Fizz"
                it % 5 == 0 -> result[it - 1] = "Buzz"
                else -> result[it - 1] = it.toString()
            }
        }
        return result.toList()
    }
}