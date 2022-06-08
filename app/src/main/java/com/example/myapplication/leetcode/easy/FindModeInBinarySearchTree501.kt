package com.example.myapplication.leetcode.easy

import com.example.myapplication.leetcode.TreeNode

object FindModeInBinarySearchTree501 {

    private val resultMap: MutableMap<Int, Int> = mutableMapOf()

    fun findMode(root: TreeNode?): IntArray {
        resultMap[root!!.`val`] = 1
        if (root.left != null) root.left!!.goToNextNode()
        if (root.right != null) root.right!!.goToNextNode()
        return resultMap.filter { it.value == resultMap.values.maxOrNull() }.keys.toIntArray()
    }

    private fun TreeNode.goToNextNode() {
        if (resultMap[`val`] == null) resultMap[`val`] = 1
        else resultMap[`val`] = resultMap[`val`]!! + 1
        if (left != null) left!!.goToNextNode()
        if (right != null) right!!.goToNextNode()
    }
}