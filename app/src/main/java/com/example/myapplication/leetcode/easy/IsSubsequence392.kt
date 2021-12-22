package com.example.myapplication.leetcode.easy

object IsSubsequence392 {
    fun isSubsequence(s: String, t: String): Boolean {
        val input = s.toMutableList()
        t.forEach {
            if (input.isNotEmpty() && it == input[0]) input.removeAt(0)
        }
        return input.isEmpty()
    }
}