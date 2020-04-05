package delegation

import java.util.*

/*
*   map委託
*   將屬存儲到map中
*
*   一種常見的應用場景是將屬性存儲到map當中
*   這通常出現在Json解析或是一些動態行為
*   在這種情況中，你可以將map實例作為委託，作為類中屬性的委託
*
*   !!map中key的名字要與類中的屬性名字保持一至
* */

class Student(map: Map<String, Any?>) {

    val name: String by map
    val address: String by map
    val age: Int by map
    val brithday: Date by map
}

class Student2(map:MutableMap<String, Any?>){

    var address:String by map
}

fun main() {
    val student = Student(mapOf(
        "name" to "czchen",
        "address" to "taipei",
        "age" to 20,
        "brithday" to Date()

    ))
    println(student.name)
    println(student.address)
    println(student.age)
    println(student.brithday)

    println("------------")
    val map = mutableMapOf<String, Any?>(
        "address" to "taipei"
    )
    val student2 = Student2(map)
    println(student2.address)
    println(map["address"])
    println("------------")
    student2.address = "taichung"
    println(student2.address)
    println(map["address"])
}