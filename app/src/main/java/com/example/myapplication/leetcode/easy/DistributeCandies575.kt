package com.example.myapplication.leetcode.easy

object DistributeCandies575 {
    fun distributeCandies(candyType: IntArray): Int {
        val result = mutableListOf<Int>()
        candyType.forEach {
            if (!result.contains(it)) {
                if (result.size < candyType.size / 2) {
                    result.add(it)
                } else {
                    return candyType.size / 2
                }
            }
        }
        return if ((candyType.size / 2) < result.size) candyType.size / 2 else result.size
    }
}