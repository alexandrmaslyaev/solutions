package com.example.myapplication.leetcode.easy

object NumberComplement476 {
    fun findComplement(num: Int): Int {
        val replacedBin = Integer.toBinaryString(num)
        val stringBuilder = StringBuilder()
        replacedBin.forEach {
            stringBuilder.append(if (it == '1') '0' else '1')
        }
        println(stringBuilder)
        return Integer.parseInt(stringBuilder.toString(), 2)
    }
}