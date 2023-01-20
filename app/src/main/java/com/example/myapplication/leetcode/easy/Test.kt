package com.example.myapplication.leetcode.easy

import android.annotation.SuppressLint
import kotlin.math.abs
import kotlin.math.sign

fun Float.findNearAngle(): Float {
    val normalizedAngle = this % 360
    val minimalAngle = (this / 360f).toInt() * 360f
    return when {
        normalizedAngle in -90f..90f -> minimalAngle
        abs(normalizedAngle) >= 270f -> minimalAngle + 360f * this.sign
        abs(normalizedAngle) >= 90f -> minimalAngle + 180f * this.sign
        else -> 0f
    }
}

fun Float.findNextAngle(spinClockwise: Boolean): Float {
    val signWithoutZero = if (this.sign == 0f) 1f else this.sign
    val transformAngle: Float.() -> Float = { if (spinClockwise) this - 180f else this + 180f }
    val coerce: Float.(forLowerArc: Boolean) -> Float = { forLowerArc ->
        val minimumAngle = (abs(this@findNextAngle) / 360f).toInt() * 360f +
            if (forLowerArc) + 180f else 0f
        val maximumAngle = minimumAngle + 180f
        coerceIn(
            minimumValue = if (signWithoutZero == 1f) minimumAngle else maximumAngle * signWithoutZero,
            maximumValue = if (signWithoutZero == 1f) maximumAngle else minimumAngle * signWithoutZero,
        )
    }
    val transformedAngle = transformAngle()
    return when (abs(this@findNextAngle % 360f)) {
        0f,
        180f -> transformedAngle
        in 180f..360f -> transformedAngle.coerce(true)
        in 0f..180f -> transformedAngle.coerce(false)
        else -> 0f
    }
}
