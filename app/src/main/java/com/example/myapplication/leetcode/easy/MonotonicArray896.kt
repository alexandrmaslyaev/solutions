package com.example.myapplication.leetcode.easy

import kotlin.math.sign

fun isMonotonic(nums: IntArray): Boolean {
    if (nums.size < 3) return true
    var diffSign = 0
    for (index in 1 until nums.size) {
        val curDiffSign = (nums[index - 1] - nums[index]).sign
        if (curDiffSign != 0) {
            when {
                diffSign == 0 -> {
                    diffSign = curDiffSign
                }
                diffSign != curDiffSign -> {
                    return false
                }
            }
        }
    }
    return true
}
