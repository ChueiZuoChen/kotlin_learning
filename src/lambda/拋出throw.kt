package lambda

// throw在Kotlin中是個表達式，這解釋我們可以將throw作為Elvis表達式的一部分
// throw表達式的類型是一種特殊的類型：Nothing
// 在自己的代碼中，可以使用Nothing來標記永遠不會返回的函數
fun main() {
    val str:String? =  "a"
    val str2 = str ?:throw IllegalAccessException("值不能為空")
    println(str2)
    println("------------")

    val str3 = str ?: myMethod("hello")
    println(str3)
    println("------------")

//    Nothing? 加個問號就是他能是Nothing或是為空
    val s= null
    println(s is Nothing?)
    println("------------")

    val s2 = listOf(null)
    println(s2 is List<Nothing?>)
}

fun myMethod(message:String):Nothing{
    throw IllegalAccessException(message)
}













