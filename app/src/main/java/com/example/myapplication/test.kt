package com.example.myapplication

import com.example.myapplication.leetcode.easy.uncommonFromSentences

fun main() {
    println(uncommonFromSentences("this apple is sweet", "this apple is sour").toList())
    println(uncommonFromSentences("apple apple", "banana").toList())
}
