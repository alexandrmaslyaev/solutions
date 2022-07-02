package com.example.myapplication.leetcode.easy

import com.example.myapplication.leetcode.TreeNode

object AverageOfLevelsInBinaryTree637 {
    val result = mutableListOf<MutableList<Int>>()

    fun averageOfLevels(root: TreeNode?): DoubleArray {
        if (root == null) return doubleArrayOf()
        addToLevel(0, root)
        val resultDouble = mutableListOf<Double>()
        result.forEach { list ->
            resultDouble.add(list.average())
        }
        return resultDouble.toDoubleArray()
    }

    fun addToLevel(level: Int, node: TreeNode) {
        val value = node.`val`
        if (result.size == level) result.add(mutableListOf(value))
        else result.get(level).add(value)
        val left = node.left
        if (left != null) addToLevel(level + 1, left)
        val right = node.right
        if (right != null) addToLevel(level + 1, right)
    }
}