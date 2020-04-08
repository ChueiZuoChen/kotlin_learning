package lambda

/*
*   高階函數 (high-order function) 與 lambda
*   Lambda表達式要求：
*   1. 一個lambda表達式總是被一對花括號所包圍
*   2. 其參數(如果有的話) 位於 -> 之前 (參數類型是可以省略掉的)
*   3. 執行體位於 -> 之後
*
*   在Kotlin中，如果一個函數的最後一個參數是個函數，那麼可以將lambda表達式作為實參傳遞進去
*   並且可以在調用時方法圓括號外使用
* */

val multiply: (Int, Int) -> Int = { a, b -> a * b }
val add: (Int, Int) -> Int = { a, b -> a + b }

//類型自動推斷
val subtract = { a: Int, b: Int -> a - b }
val myAction = { println("hello world") } //無參數無回傳
val mayReturnNull2: (Int, Int) -> Int? = { _, _ -> null } //回傳可能為空
val functionMaybeNull: ((Int,Int) -> Int)? = null  //函數可能為空

fun main() {
    println(multiply(3, 4))
    myAction()

}