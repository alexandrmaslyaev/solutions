package com.example.myapplication.leetcode.easy

import com.example.myapplication.leetcode.TreeNode

object BalancedBinaryTree110 {
    fun isBalanced(root: TreeNode?): Boolean {
        if (root == null || (root.left == null && root.right == null)) return true
        if (root.right == null) { return !root.left!!.checkLeaf() }
        if (root.left == null) { return !root.right!!.checkLeaf() }
        if (root.right!!.checkLeaf() == root.left!!.checkLeaf()) {
            return isBalanced(root.left!!) && isBalanced(root.right!!)
        }
        if (root.right!!.checkLeaf()) {
            return !root.right!!.checkStick()
        }
        if (root.left!!.checkLeaf()) {
            return !root.left!!.checkStick()
        }
        return false
    }

    private fun TreeNode.checkLeaf(): Boolean {
        return left != null || right != null
    }

    private fun TreeNode.checkStick(): Boolean {
        return left!!.checkLeaf() && right!!.checkLeaf()
    }
}