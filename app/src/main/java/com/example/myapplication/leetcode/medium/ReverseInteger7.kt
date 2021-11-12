package com.example.myapplication.leetcode.medium

class ReverseInteger7 {
    fun reverse(x: Int): Int {
        try {
            return buildString {
                if (x.toString().contains('-')) {
                    append('-')
                    for (index in x.toString().length - 1 downTo 1) {
                        append(x.toString()[index])
                    }
                } else {
                    for (index in x.toString().length - 1 downTo 0) {
                        append(x.toString()[index])
                    }
                }
            }.toInt()
        } catch (e: Exception){
            return 0
        }
    }
}