package com.example.myapplication.leetcode.easy

object ReversVowelsOfAString345 {
    fun reverseVowels(s: String): String {
        val fowels = listOf('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')
        val input = s.toMutableList()
        for (index in input.indices) {
            if (fowels.contains(input[index])) input.splitFowels(index, fowels)
        }
        return input.joinToString(separator = "")
    }
}

private fun MutableList<Char>.splitFowels(startIndex: Int, fowels: List<Char>) {
    for (index in startIndex + 1 until this.size) {
        if (fowels.contains(this[index])) {
            val temp = this[index]
            this[index] = this[startIndex]
            this[startIndex] = temp
            return
        }
    }
}
