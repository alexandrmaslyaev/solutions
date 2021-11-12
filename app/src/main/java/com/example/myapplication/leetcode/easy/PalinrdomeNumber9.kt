package com.example.myapplication.leetcode.easy

class PalinrdomeNumber9 {
    fun isPalindrome(x: Int): Boolean {
        val word = x.toString()
        word.forEachIndexed { index: Int, symbol: Char ->
            if (symbol != word[word.length - index - 1]) {
                return false
            }
        }
        return true
    }
}