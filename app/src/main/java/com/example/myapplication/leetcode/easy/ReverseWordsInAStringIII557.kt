package com.example.myapplication.leetcode.easy

object ReverseWordsInAStringIII557 {
    fun reverseWords(s: String): String = s.split(" ").joinToString(" ") { it.reversed() }
}