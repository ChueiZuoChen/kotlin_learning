package delegation

import kotlin.reflect.KProperty

// 委託屬性 (delegated property) 把屬性的委託委託給委託類

/*
* 有四種情況在實際開發中比較有用：
* 1. 延遲屬性 lazy
* 2. 可觀測屬性 observable, vetoable
* 3. 非空屬性 notnull
* 4. map屬性 map
* */

class MyDelegate {
    operator fun getValue(thisRef:Any?, property:KProperty<*>):String{
        return "$thisRef, your delegated property name is ${property.name}"
    }
    operator fun setValue(thisRef: Any?, property: KProperty<*>, value:String){
        println("$thisRef, new value is $value")
    }
}

class MyPropertyClass {
//    var str: String = "A"
    var str:String by MyDelegate()
}

fun main() {
    val myPropertyClass = MyPropertyClass()
    myPropertyClass.str = "hello world"
    println(myPropertyClass.str)
}

