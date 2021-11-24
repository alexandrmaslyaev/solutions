package com.example.myapplication.leetcode.medium

import com.example.myapplication.leetcode.ListNode

object SwapNodesInPairs24 {
    fun swapPairs(head: ListNode?): ListNode? {
        val prev = head?.next
        head?.next = head?.next?.next
        prev?.next = head
        if (head?.next != null) {
            head.next = swapPairs(head.next)
        }
        return prev ?: head
    }
}