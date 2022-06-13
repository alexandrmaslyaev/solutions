package com.example.myapplication.leetcode.easy

import kotlin.math.min

object ArrayPartitionI561 {
    fun arrayPairSum(nums: IntArray): Int {
        val sortedInput = nums.sorted()
        val pairs = mutableListOf<Pair<Int, Int>>()
        for (i in 1..sortedInput.lastIndex step 2) {
            pairs.add(Pair(sortedInput[i - 1], sortedInput[i]))
        }
        var result = 0
        pairs.forEach { pair ->
            result += min(pair.first, pair. second)
        }
        return result
    }
}