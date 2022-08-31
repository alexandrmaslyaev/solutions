package com.example.myapplication.leetcode.easy

const val ABSENT = 'A'
const val LATE = 'L'
const val LATE_MAX = 3
const val ABSENT_MAX = 2

object StudentAttendanceRecordI {
    fun checkRecord(s: String): Boolean {
        var lateCounter = 0
        var absentCounter = 0

        s.forEachIndexed { index, char ->
            if (char == ABSENT) absentCounter++
            if (char == LATE) {
                if (index > 0 && s[index - 1] == LATE) lateCounter++
                else lateCounter = 1
            }
            if (lateCounter == 3 || absentCounter == 2) return false
        }

        return lateCounter < LATE_MAX && absentCounter < ABSENT_MAX
    }
}