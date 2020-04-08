package lambda

fun main() {
    val strings = arrayOf("hello","world","hello world", "welcome","abc")
    strings.filter { it.contains('h') }.forEach { println(it) }
    println("-----------")

    strings.forEach {
        if (it.contains('h')){
            println(it)
        }
    }
    println("-----------")

    strings.filter { it.length > 4 }.forEach { println(it) }
    println("-----------")

//    把結尾字母是d的字用大寫印出來
    strings.filter { it.endsWith("d",ignoreCase = true) }.map { it.toUpperCase() }.forEach { println(it) }
}












