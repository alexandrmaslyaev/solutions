package com.example.myapplication.leetcode.easy

object AddStrings415 {
    fun addStrings(num1: String, num2: String): String {
        var plusOne = 0
        var result = ""
        val str = if (num1.length > num2.length) num1.reversed() else num2.reversed()
        val str2 = if (str == num1.reversed()) num2.reversed() else num1.reversed()
        for (index in str.indices) {
            var temp = 0
            temp += plusOne
            plusOne = 0
            temp += if (index < str2.length) {
                str[index].toString().toInt() + str2[index].toString().toInt()
            } else {
                str[index].toString().toInt()
            }
            if (temp > 9) {
                temp -= 10
                plusOne = 1
            }
            result = "$result$temp"
        }
        result = if (plusOne == 1) "$result$plusOne" else result
        return result.reversed()
    }
}