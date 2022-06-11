package com.example.myapplication.leetcode.easy

object FibonacciNumber509 {
    fun fib(n: Int): Int {
        val f0 = 0
        val f1 = 1
        if (n == 0 || n == 1) return n
        var fnmin1 = f1
        var fnmin2 = f0
        var fn = 0
        for (tempN in 2..n) {
            fn = fnmin1 + fnmin2
            fnmin1 = fn.also { fnmin2 = fnmin1 }
        }
        return fn
    }
}