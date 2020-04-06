package lambda

/*
*   中綴符號 infix notaion
*   函數還可以通過中綴符號形式來調用，需要滿足如下3個條件：
*   1. 是成員函數或是擴展函數
*   2. 擁有單個參數
*   3. 聲明時使用infix關鍵字
* */

class InfixTest(private var a: Int) {
    infix fun add(b: Int) = this.a + b
}

fun main() {
    val infixTest = InfixTest(2)
    println(infixTest.add(5))

    //中綴符號調用法 空格隔開
    println(infixTest add 5)
}