package lambda

fun myPrint(nameString: String) {
    println(nameString)
}

//單表達式函數，函數的返回類型如果可以通過類型推斷判斷出來，那麼返回類型就可以省略掉
fun add(a: Int, b: Int) = a + b

/*
*   顯示返回類型
*   擁有方法體的函數必須要顯示指定返回類型，除非函數返回Unit，這時返回類型就可以省略掉
*   Kotlin並不會推斷擁有快體的函數的返回類型，因為這種函數可能擁有非常複雜的控制流程
*   返回類型對於閱讀代碼的人來說就不是那麼明顯了(有時，對於編譯器來說亦是如此)
* */

/*
*   一個方法中，只允許一個參數為vararg，通常作為最後一個參數，如果vararg不是最後一個參數
*   那麼其後的參數就需要通過去名參數形式執行傳遞; 如果其後的參數是函數類型，那麼還可以通過在圓括號外
*   傳遞lambda表達式來實現
* */

fun <T> conver2List(vararg element: T): List<T> {
    val result = ArrayList<T>()
    element.forEach { result.add(it) }
    return result
}

fun main() {
    println(conver2List("hello", "world", "hello world"))

    var elements = arrayOf("hello", "world", "hello world")

    // elements 是一個Array 前面加一個星號就是把它打散
    // *elements = ["hello","world","hello world"]
    println(conver2List("chen", "cz", *elements))
}











