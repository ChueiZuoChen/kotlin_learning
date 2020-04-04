package generics

import kotlin.test.assertTrue
//POCI: Producer Out, Consumer In
class ParameterizedClass<A>(private val value: A) {
    fun getValue(): A {
        return this.value
    }
}

class ParameterizedProducer<out T>(private val value: T) {
    fun get(): T {
        return this.value
    }
}

class ParameterizedConsumer<in T> {
    fun toString(value: T): String {
        return value.toString()
    }
}

fun main() {
    val parameterizedClass = ParameterizedClass<String>("hello world")
    val result = parameterizedClass.getValue()
    assertTrue(result is String)
    println("-----------")

    val parameterizedProducer = ParameterizedProducer("This")
    val myRef: ParameterizedProducer<Any> = parameterizedProducer
    assertTrue(myRef is ParameterizedProducer<Any>)
    println("-----------")

    val parameterizedConsumer = ParameterizedConsumer<Number>()
    val myRef2: ParameterizedConsumer<Int> = parameterizedConsumer
    assertTrue(myRef2 is ParameterizedConsumer<Int>)
}
