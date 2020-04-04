package nestedclass

/*嵌套類*/

class OuterClass {
    private val str: String = "hello world"

    class NestedClass{
        fun nestedMethod() = "welcome"
    }
}

fun main() {
    println(OuterClass.NestedClass().nestedMethod())
}