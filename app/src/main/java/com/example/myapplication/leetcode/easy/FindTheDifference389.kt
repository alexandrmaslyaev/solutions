package com.example.myapplication.leetcode.easy

object FindTheDifference389 {
    fun findTheDifference(s: String, t: String): Char {
        val inputS = s.toMutableList()
        t.forEach {
            if (!inputS.contains(it)) return it
            inputS.remove(it)
        }
        return 'a'
    }
}