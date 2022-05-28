package com.example.myapplication.leetcode.easy

object RepeatedSubstringPattern459 {
    fun repeatedSubstringPattern(s: String): Boolean {
        for (i in s.length / 2 downTo 0) {
            if (s.split(s.substring(0, i)).joinToString(separator = "").trim().isBlank())
                return true
        }
        return false
    }
}