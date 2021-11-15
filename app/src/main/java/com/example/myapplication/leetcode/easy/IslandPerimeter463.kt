package com.example.myapplication.leetcode.easy

class IslandPerimeter463 {
    fun islandPerimeter(grid: Array<IntArray>): Int {
        var result = 0
        val columns = mutableMapOf<Int, MutableList<Int>>() // column to row
        for (lineIndex in grid.indices) {
            for (colIndex in grid[lineIndex].indices) {
                if (grid[lineIndex][colIndex] == 1) {
                    result += if (colIndex > 0) {
                        if (grid[lineIndex][colIndex - 1] == 1) 2
                        else 4
                    } else 4
                }
                columns.getOrPut(colIndex) {
                    mutableListOf()
                }.add(grid[lineIndex][colIndex])
            }
        }
        columns.forEach {
            for (lineIndex in it.value.indices) {
                if (it.value[lineIndex] == 1) {
                    result -= if (lineIndex > 0) {
                        if (it.value[lineIndex - 1] == 1) 2
                        else 0
                    } else 0
                }
            }
        }
        return result
    }
}