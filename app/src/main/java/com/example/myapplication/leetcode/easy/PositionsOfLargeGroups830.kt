package com.example.myapplication.leetcode.easy

object PositionsOfLargeGroups830 {
    fun largeGroupPositions(s: String): List<List<Int>> {
        val result: MutableList<List<Int>> = mutableListOf()
        var counter = 1
        s.forEachIndexed { index, char ->
            if (index < s.lastIndex && char == s[index + 1]) counter++
            else {
                if (counter > 2) result.add(listOf(index - counter + 1, index))
                counter = 1
            }
        }
        return result.toList()
    }
}