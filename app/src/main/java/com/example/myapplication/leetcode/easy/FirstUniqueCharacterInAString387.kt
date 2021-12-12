package com.example.myapplication.leetcode.easy

object FirstUniqueCharacterInAString387 {
    fun firstUniqChar(s: String): Int {
        val findSymbols: MutableMap<Char, Int> = mutableMapOf()
        s.forEachIndexed { index, char ->
            val temp = findSymbols.getOrPut(char) { -1 }
            findSymbols[char] = if (temp == -1) index else Int.MAX_VALUE
        }
        val index = findSymbols.filter { it.value != Int.MAX_VALUE }.values.firstOrNull()
        return index ?: -1
    }
}