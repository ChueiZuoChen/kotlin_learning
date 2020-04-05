package nestedclass

/* 嵌套類
*  嵌套類不能訪問外部類的其他成員，只能訪問另一個嵌套類
* */

class OuterClass {
    private val str: String = "hello world"

    class NestedClass{
        fun nestedMethod() = "welcome"
    }

    class NestedClass2{
        val nestedClass = NestedClass()
    }
}

fun main() {
    println(OuterClass.NestedClass().nestedMethod())
}