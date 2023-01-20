class Q14_LongestCommonPrefix {

    fun longestCommonPrefix(strs: Array<String>): String {
        var prefix = ""
        var s = strs[0]
        for (idx in 1..s.length) {
            for (index in 1 until strs.size){
                if(!strs.get(index).startsWith(s.substring(0,idx)))
                    return prefix;
            }
            prefix = s.substring(0,idx)
        }
        return prefix;
    }
}

fun main (args : Array<String>){
    val strs1 = arrayOf("flower", "flow", "flight")
    val strs2 = arrayOf("dog", "racecar", "car")
    val obj = Q14_LongestCommonPrefix();
    println(obj.longestCommonPrefix(strs1))
    println(obj.longestCommonPrefix(strs2))

}
