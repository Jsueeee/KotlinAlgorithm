package com.Algorithm

fun main() {
    val result = Solution().solution(
        intArrayOf(1, 5, 2, 6, 3, 7, 4),
        arrayOf(
            intArrayOf(2,5,3),
            intArrayOf(4,4,1),
            intArrayOf(1,7,3)
        )
    )
    result.forEach {
        println(it)
    }
}

class Solution {
//    fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
//        val answer = IntArray(commands.size)
//
//        for ( i in commands.indices) {
//            var tempArray = array.slice(commands[i][0]-1 until commands[i][1])
//            tempArray = tempArray.sorted()
//            answer[i] = tempArray[commands[i][2]-1]
//        }
//
//        answer.forEach {
//            println(it)
//        }
//        return answer
//    }

    fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
        return commands.map { command ->
            array.slice(IntRange(command[0] - 1, command[1] - 1)).sorted()[command[2] - 1]
        }.toIntArray()
    }
}