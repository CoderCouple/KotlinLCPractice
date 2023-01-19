class Q9_PalindromeNumber {
    fun isPalindrome(x: Int): Boolean {

        var num = x.toString();
        var start = 0;
        var end = num.length-1;

        while (start<=end){
         if(num[start] != num[end]){
             return false
         }
            start++;
            end--;
        }
        return true;
    }
}

fun main(args: Array<String>){
    val x1 : Int = 1234321
    val x2 : Int = 12343215
    val obj = Q9_PalindromeNumber();
    println(obj.isPalindrome(x1))
    println(obj.isPalindrome(x2))
}
