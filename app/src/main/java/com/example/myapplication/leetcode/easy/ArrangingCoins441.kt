package com.example.myapplication.leetcode.easy

object ArrangingCoins441 {
    fun arrangeCoins(n: Int): Int {
        return when (n) {
            1 -> n
            else -> directArrangeCoins(n)
        }
    }

    private fun directArrangeCoins(numberOfCoins: Int): Int {
        var numberOfRow = 2
        var prevNumberOfItems: Long = 1
        while (true) {
            println(numberOfRow)
            val count: Long = prevNumberOfItems + numberOfRow
            when {
                count == numberOfCoins.toLong() -> {
                    return numberOfRow
                }
                count > numberOfCoins -> {
                    return numberOfRow - 1
                }
                else -> {
                    prevNumberOfItems = count
                    numberOfRow++
                }
            }
        }
    }

    // Throws StackOverFlow exception
    private fun recurArrangeCoins(prevNumberOfItems: Long, numberOfRow: Int, numberOfCoins: Int): Int {
        val count: Long = prevNumberOfItems + numberOfRow
        return when {
            count == numberOfCoins.toLong() -> numberOfRow
            count > numberOfCoins -> numberOfRow - 1
            else -> recurArrangeCoins(prevNumberOfItems = count,numberOfRow + 1, numberOfCoins)
        }
    }
}