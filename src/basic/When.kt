package basic

fun main() {
    println(myPrint("hello"))
    println(myPrint("world"))
    println(myPrint("hello world"))
    println(myPrint("hi"))
    println("------")
    println(myPrint2("test"))
    println("------")

    val a = 5
    val result = when (a) {
        1 -> {
            println("a=1")
            10
        }
        2 -> {
            println("a=2")
            20
        }
        3, 4, 5 -> {
            println("a = 3 or 4 or 5")
            30
        }
        in 6..10 -> {
            println("a is between 6 and 10")
            40
        }
        else -> {
            println("a is out of 10")
            50
        }
    }
    println(result)
}

fun myPrint(str: String): String {
    return when (str) {
        "hello" -> "Hello"
        "world" -> "WORLD"
        "hello world" -> "HELLO WORLD"
        else -> "other input"
    }
}

fun myPrint2(str: String) =
    when (str) {
        "hello" -> "Hello"
        "world" -> "WORLD"
        "hello world" -> "HELLO WORLD"
        else -> "other input"
    }