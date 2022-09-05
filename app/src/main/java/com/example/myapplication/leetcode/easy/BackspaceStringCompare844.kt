package com.example.myapplication.leetcode.easy

import java.lang.StringBuilder

object BackspaceStringCompare844  {
    fun backspaceCompare(s: String, t: String): Boolean {
        val resultS = StringBuilder()
        val resultT = StringBuilder()
        s.forEachIndexed { index, char ->
            if (char == '#' && resultS.isNotEmpty()) {
                resultS.deleteCharAt(resultS.lastIndex)
            }
            if (char != '#') {
                resultS.append(char)
            }
        }
        t.forEachIndexed { index, char ->
            if (char == '#' && resultS.isNotEmpty()) {
                resultT.deleteCharAt(resultT.lastIndex)
            }
            if (char != '#') {
                resultT.append(char)
            }
        }
        return resultS.toString() == resultT.toString()
    }
}