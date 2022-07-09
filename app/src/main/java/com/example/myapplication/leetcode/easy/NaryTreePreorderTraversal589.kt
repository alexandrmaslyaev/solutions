package com.example.myapplication.leetcode.easy

import com.example.myapplication.leetcode.Node

object NaryTreePreorderTraversal589 {
    val result: MutableList<Int> = mutableListOf()
    fun preorder(root: Node?): List<Int> {
        if (root == null) return emptyList()
        root.children.forEach { node ->
            if (node != null) mPreorder(node)
        }
        result.add(root.`val`)
        return result
    }

    fun mPreorder(root: Node) {
        root.children.forEach { node ->
            if (node != null) preorder(node)
        }
        result.add(root.`val`)
    }
}