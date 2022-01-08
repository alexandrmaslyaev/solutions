package com.example.myapplication.leetcode.easy

object HappyNumber202 {
    var counterForTimeLimit = 0
    fun isHappy(n: Int): Boolean = checkNumbers(word = n.toString()) == 1

    fun checkNumbers(prev: Int = 0, word: String): Int {
        try {
            if (counterForTimeLimit > 10000) return word.toInt()
            if (word.toInt() == prev) return word.toInt()
            var result = 0
            if (word.toInt() >= 10) {
                word.forEach {
                    result += (it.toString().toInt() * it.toString().toInt())
                }
            } else {
                result = 0 + (word.toInt() * word.toInt())
            }
            counterForTimeLimit++
            return checkNumbers(word.toInt(), result.toString())
        } catch (e: StackOverflowError) {
            return 0
        }
    }
}