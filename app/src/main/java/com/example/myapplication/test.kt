package com.example.myapplication

import com.example.myapplication.leetcode.easy.*

fun main() {
    // negative and zero
    check(0f.findNextAngle(true) == -180f)
    check(0f.findNextAngle(false) == 180f)
    check((-1440f).findNextAngle(true) == -1620f)
    check((-1440f).findNextAngle(false) == -1260f)

    check((-45f).findNextAngle(true) == -180f)
    check((-45f).findNextAngle(false) == 0f)
    check((-1505f).findNextAngle(true) == -1620f)
    check((-1505f).findNextAngle(false) == -1440f)

    check((-180f).findNextAngle(true) == -360f)
    check((-180f).findNextAngle(false) == 0f)
    check((-1620f).findNextAngle(true) == -1800f)
    check((-1620f).findNextAngle(false) == -1440f)

    check((-225f).findNextAngle(true) == -360f)
    check((-225f).findNextAngle(false) == -180f)
    check((-1685f).findNextAngle(true) == -1800f)
    check((-1685f).findNextAngle(false) == -1620f)

    // positive

    check(45f.findNextAngle(true) == 0f)
    check(45f.findNextAngle(false) == 180f)
    check(1505f.findNextAngle(true) == 1440f)
    check(1505f.findNextAngle(false) == 1620f)

    check(180f.findNextAngle(true) == 0f)
    check(180f.findNextAngle(false) == 360f)
    check(1620f.findNextAngle(true) == 1440f)
    check(1620f.findNextAngle(false) == 1800f)

    check(225f.findNextAngle(true) == 180f)
    check(225f.findNextAngle(false) == 360f)
    check(1685f.findNextAngle(true) == 1620f)
    check(1685f.findNextAngle(false) == 1800f)
}
