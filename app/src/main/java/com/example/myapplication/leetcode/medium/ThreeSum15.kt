package com.example.myapplication.leetcode.medium

// TODO: not done
object ThreeSum15 {
    fun threeSum(nums: IntArray): List<List<Int>> {
        val result = hashSetOf<ArrayList<Int>>()
        val list = nums.toMutableList()
        list.forEachIndexed { index, first ->
            println("first = $first, index = $index")
            list.subList(1 + index, list.size).forEachIndexed { indexSec, second ->
                println("second = $second, index = $indexSec")
                list.subList(1 + index + indexSec, list.size).forEachIndexed { indexThr, third ->
                    println("third = $third, index = $indexThr")
                    val arList = arrayListOf(first, second, third)
                    if (!result.any {
                            it.sortedDescending().hashCode() == arList.sortedDescending()
                                .hashCode()
                        } && first + second + third == 0) {
                        println("Added")
                        result.add(arList)
                    }
                    println()
                }
            }
        }
        return result.map { it.toList() }
    }
}