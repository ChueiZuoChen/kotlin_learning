package delegation

import kotlin.properties.Delegates

//非空屬性

//notNull 適用於那些無法在初始化階段就確定屬性值得場合
class MyPerson {
    var address:String by Delegates.notNull<String>()
}

fun main() {
    val myPerson = MyPerson()
    myPerson.address = "asd"
    println(myPerson.address)
}