class Solution {
    val map = mutableMapOf<Int,Int>()
    fun twoSum(nums: IntArray, target: Int): IntArray {
        for ((index, num) in nums.withIndex()){
            println("Num = ${num} and Index = ${index}")
            map.map { println("${it.key} : ${it.value}") }
            var key: Int = target - num
            if(map.containsKey(key)) {
                return intArrayOf(index, map[key]!!)
            } else {
                map.put(num,index)
            }
        }
        return intArrayOf(0,0)
    }
}

fun main(args: Array<String>){
    val array: IntArray = intArrayOf(2,7,11,15)
    val target = 13
    val obj = Solution()
    val res =obj.twoSum(array,target)
    println("Index are ${res[0]} and ${res[1]}")
}
