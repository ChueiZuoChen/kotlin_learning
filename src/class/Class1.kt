package `class`

/*1. 在Kotlin中，一個類別可以有一個primary主建構函式以及一個或多個secondary次建構函式
* 2. primary建構函式是類別頭(class header)的一部分，它位於類別名稱後面，可以擁有多個參數
* 3. 如果primary主建構函式沒有任何註解(@)或是可見性關鍵字修飾(private)，那麼constructor關鍵字可以省略，一省略的話就變成使用secondary建構函式
* */

/*class MyClass(username:String) 與下面等價*/
class MyClass constructor(username: String) {
    /*init是初始化代碼塊主要作用:
    * 1. 是給類的對象或成員變數初始化賦予初值的
    * 2. 可以使用主建構函式(constroctor)傳進來的值*/
    init {
        println("int init block: $username")
    }

    /*成員變數初始化的第二個方法就是也可以直接給值*/
    private val username: String = username.toUpperCase()
}

fun main() {
    var myClass = MyClass("czchen")
}

