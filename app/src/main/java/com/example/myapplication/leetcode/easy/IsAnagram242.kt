package com.example.myapplication.leetcode.easy

object IsAnagram242 {
    fun isAnagram(s: String, t: String): Boolean {
        val inputT = t.toMutableList()
        var inputS = ""
        val listCharsForDelete = mutableListOf<Char>()
        s.forEach { char ->
            if (!inputT.contains(char)) return false
            inputT.remove(char)
            listCharsForDelete.add(char)
        }
        inputS = s.filterNot { listCharsForDelete.contains(it) }
        return inputT.isEmpty() && inputS.isEmpty()
    }
}