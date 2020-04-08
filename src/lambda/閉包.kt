package lambda

/*
*   閉包
* */

fun main() {
    var sum = ""

    val strings = arrayOf("hello","world","bye")

    strings.filter { it.length >3 }.forEach {
//      在forEach lambda表達式裡面是封閉的，可是卻可以訪問外面的變量並且修改外層的變量值
        sum += it
    }

    println(sum)
}