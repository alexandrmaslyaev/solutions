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

@SuppressLint("LogNotTimber")
fun Float.findNextAngle(spinClockwise: Boolean): Float {
    val signWithoutZero = if (this.sign == 0f) 1f else this.sign
    val transformAngle: Float.() -> Float = {
        if (spinClockwise) this - 180f else this + 180f
    }
    val coerceUpToLowerArc: Float.() -> Float = {
        val minimumAngle = (abs(this@findNextAngle) / 360f).toInt() * 360f + 180f
        val maximumAngle = minimumAngle + 180f
        coerceIn(
            minimumValue = if (signWithoutZero == 1f) minimumAngle else maximumAngle * signWithoutZero,
            maximumValue = if (signWithoutZero == 1f) maximumAngle else minimumAngle * signWithoutZero,
        )
    }
    val coerceToUpperArc: Float.() -> Float = {
        val minimumAngle = (this@findNextAngle / 360f).toInt() * 360f
        val minimumValue1 = if (signWithoutZero == 1f) minimumAngle else minimumAngle - 180f
        val maxAn = if (signWithoutZero == 1f) minimumAngle + 180f else minimumAngle
        coerceIn(
            minimumValue = minimumValue1,
            maximumValue = maxAn,
        )
    }
    val transformedAngle = transformAngle()
    return when (abs(this@findNextAngle % 360f)) {
        0f, 180f -> transformedAngle
        in 180f..360f -> transformedAngle.coerceUpToLowerArc()
        in 0f..180f -> transformedAngle.coerceToUpperArc()
        else -> error("nepravilno ebanie volki!!!!! " +
            "current angle = $this, " +
            "spinClockwise = $spinClockwise "
        )
    }/*.also { Log.v("ROTATE", "result = $it") }*/
}

