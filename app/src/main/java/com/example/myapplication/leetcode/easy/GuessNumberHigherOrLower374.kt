package com.example.myapplication.leetcode.easy

object GuessNumberHigherOrLower374 : GuessGame() {
    fun guessNumber(n: Int): Int {
        if (n == 1) return n
        val mid = n / 2
        val result = guess(mid)
        return when {
            result > 0 -> binarySearch(mid, n)
            result < 0 -> binarySearch(1, mid)
            else -> mid
        }
    }

    fun binarySearch(start: Int, end: Int): Int {
        if (end == start) return end
        val mid = (end - start) / 2 + start
        val result = guess(mid)
        return when {
            result > 0 -> binarySearch(mid + 1, end)
            result < 0 -> binarySearch(start, mid - 1)
            else -> mid
        }
    }
}

open class GuessGame {
    fun guess(i: Int): Int = 0
}