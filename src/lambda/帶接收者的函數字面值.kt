package lambda

/*
*   帶接收者的函數字面
*   Kotlin提供了這樣一種功能：可以通過指定的接收者對象調用一個函數字面值
*   在函數字面值內部，你可以調用接收者對象的方法而無需使用任何額外的修飾符
*
*   這一點非常類似擴展函數
* */

fun main() {
    //變數的類型
    val subtract: Int.(other: Int) -> Int = { other -> this - other }
    println(1.subtract(3))  //this是1, other是3
    println("-----------")

    /*
    *   匿名函數語法可以讓我們指定函數字面值的接收者類型，這樣，我們就可以去聲明一個帶有接收者的函數類型變量，然後再去利用他
    * */

    //變數的方法
    val sum = fun Int.(other: Int): Int = this - other
    println(1.sum(2))
    println("-----------")

    /*
    *   帶有接收者類型的函數的非字面值可以作為參數進行傳遞，前提是所需要接收函數的地方應有一個接收者類型的參數
    *   比如說: 類型 String.(Int) -> Boolean 與 (String,Int) -> Boolean等價
    * */

    val myEquals: String.(Int) -> Boolean = { param ->
        this.toIntOrNull() == param
    }
    println("1".myEquals(1))

    fun myTest(op:(String,Int)->Boolean,a:String,b:Int,c:Boolean) = println(op(a,b)==c)
    println(myTest(myEquals, "123", 123, true))

}














