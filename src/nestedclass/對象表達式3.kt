package nestedclass

/*
* 匿名對象只能在局部變量範圍內或是被private修飾的成員變量範圍內才能被識別出其真正的類型
* 如果將匿名對象當作一個public方法的返回類型或是public屬性的類型，那麼該方法或是屬性的真正類型
* 就是該匿名對象所聲明的父類型，如果沒有聲明任何父類型，那麼其類型就是Any;
* 在這種情況下，匿名中所聲明的任何成員都是無法訪問的
* */

class MyClass {
    //去掉private會出錯，因為匿名類別是局部變量不能被外部所使用
    private val myObject = object {
        fun output() {
            println("output invoked")
        }
    }

    fun myTest() {
        println(myObject.javaClass)
        myObject.output()
    }
}

class MyClass2{
    private fun method() = object {
        val str = "hello"
    }
    //因為他是internal 不是private 所以匿名表達式會被當成public，所以沒辦法放問str2
    internal fun method2() = object {
        val str2 = "world"
    }
    fun test() {
        val str = method().str
        val str2 = method2()
    }
}

fun main() {
    var myClass = MyClass()
    myClass.myTest()

}










