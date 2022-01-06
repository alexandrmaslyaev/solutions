package com.example.myapplication.leetcode.easy

import java.util.*

class MyStack {

    val stack: Queue<Int> = LinkedList<Int>()

    fun push(x: Int) {
        stack.add(x)
    }

    fun pop(): Int {
        val last = stack.last()
        stack.remove(last)
        return last
    }

    fun top(): Int = stack.first()

    fun empty(): Boolean = stack.isEmpty()
}