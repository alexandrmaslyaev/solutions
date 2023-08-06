package com.example.myapplication.leetcode.easy

import kotlin.math.abs
import kotlin.math.sign

fun Float.findNearAngle(velocity: Float): Float {
    val velocityAddition = if (abs(velocity) > 1000) {
        90f * velocity.sign
    } else {
        0f
    }
    val normalizedAngle = this.normalizeAngle() + velocityAddition
    val minimalAngle = (this / 360f).toInt() * 360f
    println(minimalAngle)
    return when {
        normalizedAngle in -90f..90f -> minimalAngle
        abs(normalizedAngle) >= 270f -> minimalAngle + 360f * this.sign
        abs(normalizedAngle) >= 90f -> minimalAngle + 180f * this.sign
        else -> 0f
    }
}

internal fun Float.normalizeAngle(): Float = this % 360f
