package com.example.myapplication.leetcode.medium

fun findAnagrams(s: String, p: String): List<Int> {
    val result = mutableListOf<Int>()
    for (i in 0..s.length - p.length) {
        val sub = s.substring(i, i + p.length)
        if (isAnagram(sub, p)) {
            result.add(i)
        }
    }
    return result
}

fun isAnagram(sub: String, p: String): Boolean {
    val ignoredChars = mutableListOf<Char>()
    sub.forEach { char ->
        if (ignoredChars.contains(char)) return@forEach
        if (sub.count { it == char } != p.count { it == char }) return false
        ignoredChars.add(char)
    }
    return true
}