package com.example.myapplication.leetcode.easy

class RomanToInteger13 {
    fun romanToInt(s: String): Int {
        var string = s
        var result = 0
        var i = 0
        while (string != "") {
            if (s[i] == 'M') {
                result += (if (i == 0) 1000
                else {
                    if (s[i - 1] == 'C') 800 else 1000
                })
                string = string.substring(1)
                i++
                continue
            }
            if (s[i] == 'D') {
                result += (if (i == 0) 500
                else {
                    if (s[i - 1] == 'C') 300 else 500
                })
                string = string.substring(1)
                i++
                continue
            }
            if (s[i] == 'C') {
                result += (if (i == 0) 100
                else {
                    if (s[i - 1] == 'X') 80 else 100
                })
                string = string.substring(1)
                i++
                continue
            }
            if (s[i] == 'L') {
                result += (if (i == 0) 50
                else {
                    if (s[i - 1] == 'X') 30 else 50
                })
                string = string.substring(1)
                i++
                continue
            }
            if (s[i] == 'X') {
                result += (if (i == 0) 10
                else {
                    if (s[i - 1] == 'I') 8 else 10
                })
                string = string.substring(1)
                i++
                continue
            }
            if (s[i] == 'V') {
                result += (if (i == 0) 5
                else {
                    if (s[i - 1] == 'I') 3 else 5
                })
                string = string.substring(1)
                i++
                continue
            }
            if (s[i] == 'I') {
                result++
                string = string.substring(1)
                i++
            }
        }
        return (result)
    }
}