package com.example.myapplication.leetcode.easy

object RansomNote383 {
    fun canConstruct(ransomNote: String, magazine: String): Boolean {
        val magazineList = magazine.toMutableList()
        ransomNote.forEach {
            if (!magazineList.contains(it)) return false
            else magazineList.remove(it)
        }
        return true
    }
}