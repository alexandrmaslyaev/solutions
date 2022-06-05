package com.example.myapplication.leetcode.easy

object TeemoAttacking495 {
    fun findPoisonedDuration(timeSeries: IntArray, duration: Int): Int {
        var result = duration
        var i = 1
        while (i < timeSeries.size) {
            val diff = timeSeries[i] - timeSeries[i - 1]
            result += if (diff < duration) diff
            else duration
            i++
        }
        return result
    }
}