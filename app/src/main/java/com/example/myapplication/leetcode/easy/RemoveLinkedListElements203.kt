package com.example.myapplication.leetcode.easy

import com.example.myapplication.leetcode.ListNode

object RemoveLinkedListElements203 {
    fun removeElements(head: ListNode?, `val`: Int): ListNode? {
        var n1 = head
        var result: ListNode? = null
        while (n1 != null) {
            if (result == null) {
                if (n1.`val` != `val`) {
                    n1.next = getFirstFiltered(n1.next, `val`)
                    result = n1
                }
            } else {
                n1.next = getFirstFiltered(n1.next, `val`)
            }
            n1 = n1.next
        }
        return result
    }

    private fun getFirstFiltered(next: ListNode?, `val` : Int): ListNode? {
        if (next == null) return null
        return if (next.`val` == `val`) getFirstFiltered(next.next, `val`) else next
    }
}