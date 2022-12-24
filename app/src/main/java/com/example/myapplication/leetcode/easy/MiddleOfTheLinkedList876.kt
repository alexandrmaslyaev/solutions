package com.example.myapplication.leetcode.easy

import com.example.myapplication.leetcode.ListNode
import kotlin.math.ceil

object MiddleOfTheLinkedList876 {
    fun middleNode(head: ListNode?): ListNode? {
        if (head == null) return null
        val lastNodeIndex = head.getLastNodeIndex()
        val middleNodeIndex = ceil(lastNodeIndex / 2.0)
        return head.getMiddleNode(middleNodeIndex.toInt())
    }

    private fun ListNode.getMiddleNode(middleNodeIndex: Int, index: Int = 0): ListNode {
        val result = if (index != middleNodeIndex) next?.getMiddleNode(middleNodeIndex, index + 1) else this
        return result ?: this
    }

    fun ListNode.getLastNodeIndex(index: Int = 0): Int {
        val result = next?.getLastNodeIndex(index + 1)
        return result ?: index
    }
}
