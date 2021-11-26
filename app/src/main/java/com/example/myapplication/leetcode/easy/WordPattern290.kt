package com.example.myapplication.leetcode.easy

import android.os.Build
import androidx.annotation.RequiresApi

object WordPattern290 {
    @RequiresApi(Build.VERSION_CODES.N)
    fun wordPattern(pattern: String, s: String): Boolean {
        val patternMap = mutableMapOf<Char, String>()
        val input = s.split(" ")
        if (input.size != pattern.length) return false
        for (index in pattern.indices) {
            val char = pattern[index]
            val stringInMap = patternMap.get(key = char)
            if (stringInMap == null) {
                if (patternMap.containsKey(char) || patternMap.values.contains(input[index])) return false
                else patternMap[char] = input[index]
            } else if (stringInMap != input[index]) return false
        }
        return true
    }
}