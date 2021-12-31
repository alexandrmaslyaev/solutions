package com.example.myapplication.leetcode.easy

import kotlin.math.max

object AddBinary67 {
    fun addBinary(a: String, b: String): String {
        val reversedA = a.reversed()
        val reversedB = b.reversed()
        var extraPlus = 0
        val resultList = mutableListOf<Char>()
        if (a == "0") return b
        if (b == "0") return a
        for (i in 0 until max(reversedA.length, reversedB.length)) {
            var tempResult = 0
            if (i < reversedA.length && i < reversedB.length) {
                tempResult =
                    reversedA[i].toString().toInt() + reversedB[i].toString().toInt() + extraPlus
                when (tempResult) {
                    2 -> {
                        tempResult = 0
                        extraPlus = 1
                    }
                    3 -> {
                        tempResult = 1
                        extraPlus = 1
                    }
                    else -> {
                        extraPlus = 0
                    }
                }
            } else {
                tempResult = if (i < reversedA.length) reversedA[i].toString()
                    .toInt() + extraPlus else reversedB[i].toString().toInt() + extraPlus
                when (tempResult) {
                    2 -> {
                        tempResult = 0
                        extraPlus = 1
                    }
                    else -> {
                        extraPlus = 0
                    }
                }
            }
            resultList.add(tempResult.toString()[0])
        }
        if (extraPlus == 1) resultList.add('1')
        return resultList.reversed().joinToString(separator = "")
    }
}