package com.example.myapplication.leetcode.easy

object FindPivotIndex724 {
    fun pivotIndex(nums: IntArray): Int {
        var left = 0
        var sum = nums.sum()
        nums.forEachIndexed { index, num ->
            sum -= num
            if (sum == left) return index
            left += num
        }
        return -1
    }
}