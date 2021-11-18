package com.example.myapplication.leetcode.easy

class RelativeRanks506 {
    fun findRelativeRanks(score: IntArray): Array<String> {
        val sortedInput = score.sorted().reversed()
        val result = mutableListOf<String>()
        score.forEach {
            val place = sortedInput.indexOf(it) + 1
            if (place < 4) {
                when (place) {
                    1 -> result.add("Gold Medal")
                    2-> result.add("Silver Medal")
                    3 -> result.add("Bronze Medal")
                }
            } else {
                result.add(place.toString())
            }
        }
        return result.toTypedArray()
    }
}