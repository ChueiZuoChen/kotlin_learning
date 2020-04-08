package lambda

import java.lang.NumberFormatException

/*
*   異常,Kotlin中的try是個表達式
*   Kotlin中是沒有checked exception(runtime exception)的
* */

fun main() {
    val a = "3a"
    val result = try {
        a.toInt()
    }catch (ex:NumberFormatException){
        null
    }finally {
        println("finially invoked")
    }
    println(result)
}