package com.example.myapplication.leetcode.easy

object SelfDividingNumbers728 {
    fun selfDividingNumbers(left: Int, right: Int): List<Int> {
        val result: MutableList<Int> = mutableListOf()
        (left..right).forEach { number ->
            if (number.isSelfDividedNumber()) result.add(number)
        }
        return result.toList()
    }

    private fun Int.isSelfDividedNumber(): Boolean {
        if (this < 10) return true
        if (this % 10 == 0) return false
        this.toString().forEach { char ->
            if (char == '0' || this % char.toString().toInt() != 0) return false
        }
        return true
    }
}