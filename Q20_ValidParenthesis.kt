import java.util.*

class Q20_ValidParenthesis {

    val openToCloseMap = mapOf("(" to ")", "{" to "}", "[" to "]")
    val closeToOpenMap = mapOf(")" to "(", "}" to "{", "]" to "[")
    val stack = Stack<String>()

    fun isValid(s: String): Boolean {
        for(c: Char in s.toCharArray()){
            if(openToCloseMap.containsKey(c.toString())){
                stack.push(c.toString())
            } else if (closeToOpenMap.containsKey(c.toString())){
                if(stack.empty())
                    return false;

                if(!stack.pop().equals(closeToOpenMap[c.toString()]))
                    return false
            }
        }

        if(!stack.isEmpty())
            return false;

        return true;
    }
}


fun main(args: Array<String>){
    val obj = Q20_ValidParenthesis();
    println(obj.isValid("()"))
    println(obj.isValid("()[]{}"))
    println(obj.isValid("(]"))
}
