package com.example.myapplication.leetcode.easy

object MinimumIndexSumOfTwoLists599 {
    fun findRestaurant(list1: Array<String>, list2: Array<String>): Array<String> {
        val result: MutableMap<Int, MutableList<String>> = mutableMapOf()
        list1.forEachIndexed { index1, rest ->
            if (list2.contains(rest)) {
                val index2 = list2.indexOf(rest)
                val currentList = result[index1 + index2]
                if (currentList == null) result[index1 + index2] = mutableListOf(rest)
                else {
                    currentList.add(rest)
                    result[index1 + index2] = currentList
                }
            }
        }
        return result[result.keys.minOrNull()]?.toTypedArray() ?: arrayOf()
    }
}