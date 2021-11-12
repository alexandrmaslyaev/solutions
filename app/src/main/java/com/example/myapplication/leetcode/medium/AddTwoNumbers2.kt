package com.example.myapplication.leetcode.medium

import com.example.myapplication.leetcode.ListNode

class AddTwoNumbers2 {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        if (l1 == null) return l2
        if (l2 == null) return l1
        var plusOne = 0
        var result: ListNode? = null
        var nextL1 = l1
        var nextL2 = l2
        var nextL3 = result
        while (nextL1 != null || nextL2 != null || plusOne != 0) {
            val first = nextL2?.`val` ?: 0
            val second = nextL1?.`val` ?: 0
            var summ = 0
            if (first + second + plusOne > 9) {
                summ = first + second + plusOne - 10
                plusOne = 1
            } else {
                summ = first + second + plusOne
                plusOne = 0
            }
            if (nextL3 == null) {
                nextL3 = ListNode(summ)
                result = nextL3
            } else {
                nextL3.next = ListNode(summ)
                nextL3 = nextL3.next
            }
            nextL1 = nextL1?.next
            nextL2 = nextL2?.next
        }
        return result
    }
}