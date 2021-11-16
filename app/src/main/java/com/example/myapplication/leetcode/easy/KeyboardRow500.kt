package com.example.myapplication.leetcode.easy

import java.util.*

class KeyboardRow500 {
    fun findWords(words: Array<String>): Array<String> {
        val result = mutableListOf<String>()
        val line1 = "qwertyuiop"
        val line2 = "asdfghjkl"
        val line3 = "zxcvbnm"
        words.forEachIndexed { index, string ->
            val str = string.lowercase(Locale.getDefault())
            val predicate1 = str.filterNot { line1.contains(it) }
            if (predicate1.length != str.length) {
                if (predicate1.isEmpty()) result.add(words[index])
                return@forEachIndexed
            }
            val predicate2 = str.filterNot { line2.contains(it) }
            if (predicate2.length != str.length) {
                if (predicate2.isEmpty()) result.add(words[index])
                return@forEachIndexed
            }
            val predicate3 = str.filterNot { line3.contains(it) }
            if (predicate3.length != str.length) {
                if (predicate3.isEmpty()) result.add(words[index])
                return@forEachIndexed
            }
        }
        return result.toTypedArray()
    }
}