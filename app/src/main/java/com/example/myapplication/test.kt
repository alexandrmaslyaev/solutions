package com.example.myapplication

import com.example.myapplication.leetcode.easy.HappyNumber202
import java.lang.Thread.sleep
import kotlin.concurrent.thread
import kotlin.coroutines.Continuation
import kotlin.coroutines.resume
import kotlin.coroutines.suspendCoroutine

fun main() {
    print(HappyNumber202.isHappy(7))
}