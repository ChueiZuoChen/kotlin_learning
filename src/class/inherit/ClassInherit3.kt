package `class`.inherit

/*繼承屬性的重寫
* 重寫無論對於方法或是屬性都必須加上override，並且必須打開父類別預設的final修飾詞為open*/

open class MyParent {
    open val name: String = "parent"
}

class MyChild : MyParent() {
    override val name: String = "child"
}

/*可以直接在MyChild2裡面定義屬性，並且把父類別的屬性直接重寫*/
class MyChild2(override val name: String) : MyParent() {

}

/*重寫了父類的方法也調用了父類的方法
* 並且重寫了父類的屬性也調用了父類的屬性*/
open class MyParent3 {
    open fun method() {
        println("Parent3 method")
    }

    /*name是一個不可變的值val並且透過get方法返回一個字串"parent"*/
    open val name: String get() = "parent"
}

/*1. val 可以 override val
* 2. var 可以 override val
* 3. val 無法 override var
* 本質上，val相當於get()，var相當於get()與set()*/
class MyChild3 : MyParent3() {
    override fun method() {
        super.method()
        println("child3 method")
    }

    override val name: String
        get() = super.name + " and child3"
}

fun main() {
    val myChild = MyChild()
    println(myChild.name)
    println("-------")

    val child3 = MyChild3()
    child3.method()
    println(child3.name)
}