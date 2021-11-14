package com.example.myapplication.leetcode.easy

class IsomorphicStrings205 {
    fun isIsomorphic(s: String, t: String): Boolean {
        val charToIndexS = mutableMapOf<Char, MutableList<Int>>()
        val charToIndexT = mutableMapOf<Char, MutableList<Int>>()
        for (index in s.indices) {
            charToIndexT.getOrPut(t[index]) {
                mutableListOf()
            }.add(index)
            charToIndexS.getOrPut(s[index]) {
                mutableListOf()
            }.add(index)
        }
        return charToIndexS.values.toList() == charToIndexT.values.toList()
    }}