package lambda

/*
*   內聯函數 (inline function)
* */

inline fun myCalculate(a: Int, b: Int) = a + b

fun main() {
    println(myCalculate(1, 2))

}