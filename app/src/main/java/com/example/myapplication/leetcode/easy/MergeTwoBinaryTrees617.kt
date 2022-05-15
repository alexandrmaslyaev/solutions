package com.example.myapplication.leetcode.easy

import com.example.myapplication.leetcode.TreeNode

object MergeTwoBinaryTrees617 {
    fun mergeTrees(root1: TreeNode?, root2: TreeNode?): TreeNode? {
        if (root1 == null && root2 == null) return null
        val result = TreeNode((root2?.`val` ?: 0) + (root1?.`val` ?: 0))
        if (root1?.right != null || root2?.right != null) result.right = mergeTrees(root1?.right, root2?.right)
        if (root1?.left != null || root2?.left != null) result.left = mergeTrees(root1?.left, root2?.left)
        return result
    }
}