package nestedclass

// 對象表達式(object expression)
// Java當中匿名內部類再多場講下都得到大量使用
// Kotlin的對象表達式就是為了解決匿名內部類的一些缺陷而產生的

/*
* 1. 匿名內部類是沒有名字的類
* 2. 匿名內部類一定是繼承了某個父類，或是實現了某個接口
* 3. Java運行時會將該匿名內部類當作他所實現的接口或是所繼承的父類來去看待
* */

/*
*  對象表達式的格式
*  object [: 若干個父類型,中間用逗號隔開] {
*
*  }
* */

interface MyInterface {
    fun myPrint(i: Int)
}

abstract class MyAbstract {
    abstract val age: Int

    abstract fun printMyAbstractInfo()
}

fun main() {

    //透過object關鍵字去實做MyInterface接口並改寫他的方法
    val myObject = object : MyInterface {
        override fun myPrint(i: Int) {
            println("i的值是$i")
        }
    }
    myObject.myPrint(100)
    println("--------------")

    //不實現任何接口也不繼承和抽象類的對象表達式的存在
    val myObject2 = object {
        init {
            println("初始化塊")
        }

        var myProperty = "hello world"
        fun myMethod() = "myMethod()"
    }
    println(myObject2.myProperty)
    println(myObject2.myMethod())
    println("--------------")

    // 在Java裡面的匿名內部類只能實現一個抽象類或是多個接口.
    // 在Kotlin解放了限制：他可以實作多個抽象類多個接口
    var myObject3 = object : MyInterface, MyAbstract() {
        override fun myPrint(i: Int) {
            println("i的值是$i")
        }

        override val age: Int
            get() = 30

        override fun printMyAbstractInfo() {
            println("printMyAbstractInfo invoked")
        }
    }
    myObject3.myPrint(200)
    println(myObject3.age)
    myObject3.printMyAbstractInfo()


}














