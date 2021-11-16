package com.example.myapplication.leetcode.easy

class MaxConsecutiveOnes485 {
    fun findMaxConsecutiveOnes(nums: IntArray): Int {
        var result = 0
        var temp = 0
        nums.forEach {
            if (it == 1) {
                temp++
                if (temp > result) {
                    result = temp
                }
            }
            if (it == 0) {
                temp = 0
            }
        }
        return result
    }
}