package com.example.myapplication.leetcode.easy

object ContainerWithMostWater11TBD {
    fun maxArea(height: IntArray): Int {
        var result = 0
        var x1 = 0
        var x2 = height.lastIndex
        while (true) {
            result = maxOf(result, minOf(height[x1], height[x2]) * (x2 - x1)) // y * x
            if (x2 - x1 != 1) {
                x2--
            } else {
                if (x1 < height.lastIndex - 1) {
                    x1++
                    x2 = height.lastIndex
                } else {
                    return result
                }
            }
        }
    }

    fun maxArea2(height: IntArray): Int {
        val mapMaxs: Map<Int, Int> = height.maxsMap // Map<Max, Index>, [[41, 1], [41, 28], [31, 4], [31, 7],..]
        var restrictedIndexes = Pair(Int.MAX_VALUE, Int.MIN_VALUE)
        var x1: Int
        var x2: Int
        x1 = getValueFromMaxs(mapMaxs, restrictedIndexes)
        // TODO: TBD
        return -1
    }

    private fun getValueFromMaxs(mapMaxs: Map<Int, Int>, restrictedIndexes: Pair<Int, Int>): Int {
        val max = mapMaxs[mapMaxs.keys.firstOrNull()]
        // TODO: TBD
        return -1
    }

    val IntArray.maxsMap: Map<Int, Int>
        get() = sorted().associateWith { indexOf(it) }

    fun getPair(mapMaxs: Map<Int, Int>, restrictedIndexes: Pair<Int, Int>): Pair<Int, Int> {
        // TODO: TBD
        return -1 to -1
    }
}
