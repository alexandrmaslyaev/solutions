package com.example.myapplication.leetcode.easy

import com.example.myapplication.leetcode.TreeNode

object SumOfLeftLeaves404 {
    fun sumOfLeftLeaves(root: TreeNode?): Int {
        var result = 0
        if (root?.left != null) result += getSumOfLeft(root.left, true)
        if (root?.right != null) result += getSumOfLeft(root.right, false)
        return result
    }

    fun getSumOfLeft(root: TreeNode?, isLeftLeaf: Boolean): Int {
        var result = 0
        if (root?.left != null) result += getSumOfLeft(root.left, true)
        if (root?.right != null) result += getSumOfLeft(root.right, false)
        if (root?.left == null && root?.right == null && isLeftLeaf) result = root?.`val` ?: 0
        return result
    }
}