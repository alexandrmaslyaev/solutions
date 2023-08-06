package com.example.myapplication.leetcode.medium

fun lengthOfLongestSubstring(s: String): Int {
    var result = 0
    var currentSubstring: ArrayList<Char> = arrayListOf()
    s.forEach { curChar ->
        val indexOfAlreadyInSubstring = currentSubstring.indexOf(curChar)
        if (indexOfAlreadyInSubstring != -1) {
            if (currentSubstring.size > result) result = currentSubstring.size
            currentSubstring =
                ArrayList(
                    currentSubstring
                        .drop(indexOfAlreadyInSubstring + 1)
                        .plus(curChar),
                )
        } else {
            currentSubstring.add(curChar)
        }
    }
    if (currentSubstring.size > result) result = currentSubstring.size
    return result
}
