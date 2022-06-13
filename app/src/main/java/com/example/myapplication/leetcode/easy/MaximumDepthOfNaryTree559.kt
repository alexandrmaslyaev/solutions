package com.example.myapplication.leetcode.easy

import com.example.myapplication.leetcode.Node

object MaximumDepthOfNaryTree559 {
    var result = 0
    fun maxDepth(root: Node?): Int {
        if (root == null) return 0
        root.children.forEach { child ->
            if (child != null) {
                incDepth(child, 1)
            }
        }
        return result
    }

    fun incDepth(root: Node, tempDepth: Int) {
        if (tempDepth > result) result = tempDepth
        root.children.forEach { child ->
            if (child != null) {
                incDepth(child, tempDepth + 1)
            }
        }
    }
}