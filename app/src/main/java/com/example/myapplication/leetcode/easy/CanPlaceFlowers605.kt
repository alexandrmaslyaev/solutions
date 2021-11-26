package com.example.myapplication.leetcode.easy

object CanPlaceFlowers605 {
    fun canPlaceFlowers(flowerbed: IntArray, n: Int): Boolean {
        var result = 0
        var index = 0
        while (index != flowerbed.size) {
            val leftIsEmpty =
                if (index == 0) true
                else flowerbed[index - 1] == 0
            val rightIsEmpty =
                if (index == flowerbed.size - 1) true
                else flowerbed[index + 1] == 0
            if (flowerbed[index] == 0 && leftIsEmpty && rightIsEmpty) {
                flowerbed[index] = 1
                result++
            }
            index++
        }
        return result >= n
    }
}