package com.example.myapplication.leetcode.easy

object NextGreaterElementI496 {
    fun nextGreaterElement(nums1: IntArray, nums2: IntArray): IntArray {
        val b = nums2.toList()
        val result = mutableListOf<Int>()
        nums1.forEach { num ->
            result.add(b.subList(b.indexOf(num), b.size).find { it > num } ?: -1)
        }
        return result.toIntArray()
    }
}