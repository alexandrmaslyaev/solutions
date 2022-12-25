package com.example.myapplication.leetcode.easy

import com.example.myapplication.leetcode.TreeNode

object LeafSimilarTrees872 {
    fun leafSimilar(root1: TreeNode?, root2: TreeNode?): Boolean {
        if (
            (root1 == null && root2 != null)
            || (root1 != null && root2 == null)
        ) {
            return false
        }
        val root1LastLeafs = root1.getLastLeafs()
        val root2LastLeafs = root2.getLastLeafs()
        return root1LastLeafs == root2LastLeafs
    }

    fun TreeNode?.getLastLeafs(): List<Int> {
        if (this == null) return listOf()
        if (right == null && left == null) return listOf(`val`)
        val result = mutableListOf<Int>()
        if (left != null) result.addAll(left.getLastLeafs())
        if (right != null) result.addAll(right.getLastLeafs())
        return result
    }
}
