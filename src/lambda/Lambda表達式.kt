package lambda

//默認參數 (default argument)
fun test(a: Int = 0, b: Int = 1) {
    println(a - b)
}

fun main() {
    test()
    test(2)
    test(b = 2) //顯示指定參數名
    test(2, 3)
    test(a = 3)
    println("------------")

    println(A().method(1))
    println(B().method(3))
    println("------------")

    test2(b = 3) //具名參數 (named argument)
//    test2(3) //No value passed to parameter 'b'
    println("------------")

    //lambda
    test3(2, 3, ::test)
    test3(2, 3, { a, b -> println(a - b) })

    //如果一個方法最後一個參數是lambda表達式的話，那麼這個lambda表達式可以放在函數調用外面的花括號裡面
    test3(2, 3) { x, y ->
        println(x - y)
    }

    //b是默認值
    test3(2) { x, y ->
        println(x - y)
    }

    test3 { x, y ->
        println(x - y)
    }


}

/*
*   如果一個默認參數位於其他無默認值參數的前面，那麼默認值只能通過在調用函數時使用具名參數的方式來使用
* */
fun test2(a: Int = 1, b: Int) = println(a - b)

/*
*   如果函數的最後一個參數是lambda表達式，而且在調用時是位於括號之外，
*   那麼就可以不指定lambda表達式的具名參數
* */
fun test3(a: Int = 1, b: Int = 2, compute: (x: Int, y: Int) -> Unit) {
    compute(a, b)
}


/*
*   對於重寫的方法來說，子類所擁有的重寫方法會使用與父類相同的默認參數值
*   在重寫一個擁有默認參數值的方法時，方法簽名中必須要將默認參數值少略掉
* */

open class A {
    open fun method(a: Int, b: Int = 4) = a + b
}

class B : A() {
    //  4省略掉
//  實際上b已經設定是父類b的默認值4了
    override fun method(a: Int, b: Int) = a + b
}













