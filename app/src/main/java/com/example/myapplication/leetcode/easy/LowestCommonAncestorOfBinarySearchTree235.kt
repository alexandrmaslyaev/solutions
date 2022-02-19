package com.example.myapplication.leetcode.easy

import com.example.myapplication.leetcode.TreeNode

object LowestCommonAncestorOfBinarySearchTree235 {
    fun lowestCommonAncestor(root: TreeNode?, p: TreeNode?, q: TreeNode?): TreeNode? {
        when (root?.`val`) {
            p?.`val` -> { return root }
            q?.`val` -> { return root }
            else -> {
                val left =
                    if (root?.left != null) lowestCommonAncestor(root.left, p, q)
                    else null
                val right =
                    if (root?.right != null) lowestCommonAncestor(root.right, p, q)
                    else null
                if (left != null && right != null) return root
                if (left == null && right != null) return right
                if (left != null && right == null) return left
                if (left == null && right == null) return null
            }
        }
        return null
    }
}