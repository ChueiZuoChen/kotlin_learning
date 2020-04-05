package delegation

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class DelegateValue {
    var value: String = ""
    operator fun getValue(theRef: Any?, property: KProperty<*>): String {
        println("output value: $value")
        return this.value
    }

    operator fun setValue(theRef: Any?, property: KProperty<*>, value: String) {
        println("input value: $value")
        this.value = value
    }
}

class DelegateValueTest : ReadWriteProperty<Any?, String> {
    var str: String = ""
    override fun getValue(thisRef: Any?, property: KProperty<*>): String {
        return str
    }

    override fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        this.str = "$value"
    }

}

class TestClass {
    var str: String by DelegateValue()
    var str2: String by DelegateValueTest()
}

fun main() {
    val testClass = TestClass()
    testClass.str = "op"
    println(testClass.str)
    testClass.str2 = "po"
    println(testClass.str2)


}