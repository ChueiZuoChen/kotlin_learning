package lambda

import java.lang.Exception



fun main() {
    val items = listOf<Int>(1,2,3,4)
    println(items.first())
    println(items.last())
    items.filter { it%2==0 }.forEach { println(it) }
    println("------------")

    val myList = mutableListOf(1,2,3)
    println(myList.requireNoNulls())

    if (myList.none { it >2 }){
        println("沒有大於10的")
    }
    println(myList.firstOrNull())
    println(myList.lastOrNull())
    println("------------")

    val myMap = mapOf("hello" to 1,"world" to 2)
    println(myMap["hello"])
    val myMap2= HashMap(myMap)
    println(myMap2)
}