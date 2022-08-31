package com.example.myapplication.leetcode.easy

object ShortestDistanceToACharacter821 {
    fun shortestToChar(s: String, c: Char): IntArray {
        val cIndexes: List<Int> = s.mapIndexed { index, char -> if (char == c) index else -1 }.filter { it != -1 }
        val result = mutableListOf<Int>()
        s.forEachIndexed { index, char ->
            result.addShortest(cIndexes, index)
        }
        return result.toIntArray()
    }

    private fun MutableList<Int>.addShortest(cIndexes: List<Int>, index: Int) {
        val (min, max) = cIndexes.findNearMaxMin(index)
        this.add(minOf(Math.abs(min - index), Math.abs(max - index)))
    }

    private fun List<Int>.findNearMaxMin(index: Int): Pair<Int, Int> {
        var result = Integer.MAX_VALUE to Integer.MAX_VALUE
        this.forEach { int ->
            if (index <= int) {
                result = result.first to int
                return result
            }
            if (index >= int) {
                result = int to result.second
            }
        }
        return result
    }
}