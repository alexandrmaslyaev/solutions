package com.example.myapplication.leetcode.easy

import kotlin.math.max
import kotlin.math.min

object HammingDistance461 {
    fun hammingDistance(x: Int, y: Int): Int {
        val binX = Integer.toBinaryString(x)
        val binY = Integer.toBinaryString(y)
        val max = if (binY.length > binX.length) binY else binX
        val min = if (binY.length > binX.length) binX else binY
        var result = 0
        val minRev = min.reversed()
        val maxRev = max.reversed()
        maxRev.forEachIndexed loop@ { index, bit ->
            if (index > minRev.lastIndex)
                if (bit == '1') result++
                else return@loop
            else if (minRev[index] != bit) result++
        }
        return result
    }
}