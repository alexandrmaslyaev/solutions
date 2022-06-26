package com.example.myapplication.leetcode.easy

import com.example.myapplication.leetcode.TreeNode

object SubtreeOfAnotherTree572 {
    fun isSubtree(root: TreeNode?, subRoot: TreeNode?): Boolean {
        if (root == null || subRoot == null) {
            return false
        }
        if (root.`val` == subRoot.`val`) {
            if (isAllNodesEquals(root, subRoot)) {
                return true
            }
        }
        if (root.left != null) if (isSubtree(root.left, subRoot)) return true
        if (root.right != null) if (isSubtree(root.right, subRoot)) return true
        return false
    }

    fun isAllNodesEquals(root: TreeNode?, subRoot: TreeNode?): Boolean {
        var result: Boolean
        val rootRight = root?.right
        val subRootRight = subRoot?.right
        val rootLeft = root?.left
        val subRootLeft = subRoot?.left
        if (subRootLeft == null && subRootRight == null && rootLeft == null && rootRight == null) return true
        result = if (rootRight?.`val` == subRootRight?.`val`) isAllNodesEquals(rootRight, subRootRight)
        else false
        result = if (rootLeft?.`val` == subRootLeft?.`val`) result && isAllNodesEquals(rootLeft, subRootLeft)
        else false
        return result

    }}