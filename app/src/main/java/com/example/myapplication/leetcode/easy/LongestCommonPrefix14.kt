package com.example.myapplication.leetcode.easy

class LongestCommonPrefix14 {
    fun longestCommonPrefix(strs: Array<String>): String {
        var counterGlobal = 201
        if (strs.size == 1) return strs[0]
        if (strs.size == 2) return strs[0].substring(0, getCounterLocal(strs[0], strs[1]))
        strs.forEachIndexed { index, string ->
            val counterLocal = if (strs.size != (index + 1)) getCounterLocal(
                string,
                strs[index + 1]
            ) else counterGlobal
            if (counterGlobal > counterLocal) {
                counterGlobal = counterLocal
                println(counterGlobal)
            }
        }
        return strs[0].substring(0, counterGlobal)
    }

    private fun getCounterLocal(stringFirst: String, stringSecond: String): Int {
        var result = 0
        val wordsFirst = stringFirst.toCharArray()
        val wordsSecond = stringSecond.toCharArray()
        if (wordsFirst.isEmpty() || wordsSecond.isEmpty()) return 0
        if (wordsFirst.size == 1) return if (wordsFirst[0] == wordsSecond[0]) 1 else 0
        wordsFirst.forEachIndexed { index, word ->
            if (wordsSecond.size >= (index + 1) && wordsFirst.size >= (index + 1)) {
                if (word == wordsSecond[index]) result += 1
                else return result
            } else {
                return result
            }
        }
        return result
    }
}