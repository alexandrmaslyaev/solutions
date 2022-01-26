package com.example.myapplication.leetcode.easy

import java.util.*

class MyQueue() {
    private val stack = Stack<Int>()

    fun push(x: Int) {
        stack.add(x)
    }

    fun pop(): Int {
        val result = stack[0]
        stack.removeElementAt(0)
        return result
    }

    fun peek(): Int = stack[0]

    fun empty(): Boolean = stack.empty()
}