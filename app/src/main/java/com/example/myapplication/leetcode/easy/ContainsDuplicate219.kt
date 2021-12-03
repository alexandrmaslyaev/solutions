package com.example.myapplication.leetcode.easy

object ContainsDuplicate219 {
    fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
        for (i in nums.indices) {
            for (j in i + 1 until nums.size) {
                if (nums[i] == nums[j] && Math.abs(i - j) <= k) return true
            }
        }
        return false
    }
}