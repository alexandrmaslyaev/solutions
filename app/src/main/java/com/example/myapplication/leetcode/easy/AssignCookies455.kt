package com.example.myapplication.leetcode.easy

object AssignCookies455 {
    fun findContentChildren(g: IntArray, s: IntArray): Int {
        var resultSuccessChldrs = 0
        var cookiesIndex = 0
        val sortedChildren = g.sorted()
        val sortedCookies = s.sorted()
        sortedChildren.forEach { avidity ->
            while (cookiesIndex < sortedCookies.size && sortedCookies[cookiesIndex] < avidity)
                cookiesIndex++

            if (cookiesIndex >= sortedCookies.size) {
                return resultSuccessChldrs
            } else {
                cookiesIndex++
                resultSuccessChldrs++
            }
        }
        return resultSuccessChldrs
    }
}