package lambda

/*
*   匿名函數
*
* */

fun main() {
    fun(x: Int, y: Int) = x + y

    fun(x: Int, y: Int): Int {
        return x + y
    }

    val string = arrayOf("hello", "world", "bye")
//  花括號 lambda表達式
    string.filter { it.length > 3 }.forEach { println(it) }

//  圓括號 匿名函式
    string.filter(fun(item: String) = item.length > 3).forEach(fun(item: String) = println(item))
//  類型自動推斷
    string.filter(fun(item) = item.length > 3).forEach(fun(item) = println(item))
}