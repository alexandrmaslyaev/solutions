package com.example.myapplication.leetcode.easy

object DetectCapital520 {
    fun detectCapitalUse(word: String): Boolean {
        val filteredString = word.filter { it.isUpperCase() }
        return filteredString.length == word.length || (filteredString.length ==  1 && word.first().isUpperCase()) || filteredString.isEmpty()
    }
}