package com.example.myapplication.leetcode.easy

fun uncommonFromSentences(s1: String, s2: String): Array<String> {
    val resultMap = mutableMapOf<String, Int>()
    (s1.split(" ") + s2.split(" ")).forEach { word ->
        resultMap[word] = resultMap.getOrPut(word) { 0 } + 1
    }
    return resultMap.filter { it.value == 1 }.keys.toTypedArray()
}
