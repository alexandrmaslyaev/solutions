package com.example.myapplication

import com.example.myapplication.leetcode.easy.*

fun main() {
    // -10 (true) -> -180 s
    // -10 (false) -> 0 s
    // -190 (true) -> -360 s
    // -190 (false) -> -180 s
    // -170 (false) -> 0 s
    // -170 (true) -> -180 s
    // -290 (true) -> -360 s
    // -290 (false) -> -180 s
    // -516 (false) -> -360 s
    // -180 (true) -> -360 s
    // -387 (true) -> -540 s
    // -477 (true) -> -540 s
    // -477 (false) -> -540 s
    // 180 (true) -> 0 s
    // 180 (false) -> 360 s
    // 0 (true) -> -180 s
    // 0 (false) -> 180 s
    // 360 (true) -> 180 s
    // 360 (false) -> 540 s
    // 387 (true) -> 360 s
    // 387 (false) -> 540 s
    // 90 (false) -> 180 s
    // 90 (true) -> 0 s
    // 200 (false) -> 360 s
    // 200 (true) -> 180 s
    // 20 (false) -> 180f s
    // 20 (true) -> 0f s
    // 110 (false) -> 180f s
    // 110 (true) -> 0f s
    println((-566f).findNextAngle(false))
    check((-10f).findNextAngle(true) == (-180f))
    check((-10f).findNextAngle(false) == 0f)
    check((-170f).findNextAngle(true) == (-180f))
    check((-170f).findNextAngle(false) == 0f)
    check((-190f).findNextAngle(true) == (-360f))
    check((-190f).findNextAngle(false) == (-180f))
    check((-290f).findNextAngle(true) == (-360f))
    check((-290f).findNextAngle(false) == (-180f))
    check((-387f).findNextAngle(true) == (-540f))
    check((-387f).findNextAngle(false) == (-360f))
    check((-536f).findNextAngle(true) == (-540f))
    check((-536f).findNextAngle(false) == (-360f))
//    check((-566f).findNextAngle(true) == (-720f))
//    check((-566f).findNextAngle(false) == (-540f))
    check(0f.findNextAngle(true) == (-180f))
    check(0f.findNextAngle(false) == 180f)
    check(360f.findNextAngle(true) == 180f)
    check(360f.findNextAngle(false) == 540f)
    check(180f.findNextAngle(true) == 0f)
    check(180f.findNextAngle(false) == 360f)
    check(540f.findNextAngle(true) == 360f)
    check(540f.findNextAngle(true) == 721f)
}
