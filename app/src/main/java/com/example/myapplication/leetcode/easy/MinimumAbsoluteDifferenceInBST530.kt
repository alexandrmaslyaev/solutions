package com.example.myapplication.leetcode.easy

import com.example.myapplication.leetcode.TreeNode
import kotlin.math.max
import kotlin.math.min

object MinimumAbsoluteDifferenceInBST530 {
    var min = Int.MAX_VALUE
    val list = mutableListOf<Int>()

    fun getMinimumDifference(root: TreeNode?): Int {
        if (root == null) return -1
        root.toList()
        list.add(root.`val`)
        list.sort()
        for (i in list.size downTo 1) {
            val diff = list[i] - list[i - 1]
            if (diff < min)
                min = diff
        }
        return min
    }

    private fun TreeNode.toList() {
        val mLeft = left
        if (mLeft != null) {
            list.add(mLeft.`val`)
            mLeft.toList()
        }
        val mRight = right
        if (mRight != null) {
            list.add(mRight.`val`)
            mRight.toList()
        }
    }
}
