package com.example.myapplication.leetcode.easy

object LongestPalindrome409 {
    fun longestPalindrome(s: String): Int {
        val map = mutableMapOf<Char, Int>()
        s.forEach { char ->
            if (map[char] == null) map[char] = 1
            else map[char] = map[char]!! + 1
        }
        var count = 0
        map.forEach { (key, value) ->
            if (value % 2 == 0) {
                count += value
                map[key] = map[key]!! - value
            }
            else if ((value - 1) % 2 == 0 && value != 1) {
                count += value - 1
                map[key] = map[key]!! - (value - 1)
            }
        }
        return count + if (map.any { it.value == 1 }) 1 else 0
    }
}