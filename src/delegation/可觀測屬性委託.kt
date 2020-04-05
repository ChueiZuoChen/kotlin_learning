package delegation

import kotlin.properties.Delegates

//可觀測屬性 Observable
/*
*   Delegates.observable 接收兩個參數：初始值與修改處理器
*   處理器會在我們每次對屬性賦值時得到調用(在賦值完成之後被調用)
*   處理器本身接收三個參數：被賦值的屬性本身，舊的屬性值與新的屬性值
*
*   Delegates.vetoable 的調用時機與Delegates.observable 相反，他是在對屬性賦值之前被調用，根據Delegates.vetoable
*   的返回結果是true還是false，來決定是否真正對屬性進行賦值
*
* */
class Person {
    var age: Int by Delegates.observable(20) { property, oldValue, newValue ->
        println("${property.name} oldValue:$oldValue newValue:$newValue")

    }
}

class Person2 {
    var age:Int by Delegates.vetoable(20) { property, oldValue, newValue ->
       when{
           oldValue < newValue -> true
           else -> false
       }
    }
}

fun main() {
    val person = Person()
    println(person.age)
    person.age = 30
    person.age = 40

    println("----------")
    val person2 = Person2()
    println(person2.age)

    person2.age = 40
    println(person2.age)

    person2.age = 30
    println(person2.age)

}