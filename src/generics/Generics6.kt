package generics


class MyStorage<out T>(private var t: T) {
    fun getValue(): T {
        return this.t
    }

    fun setValue(t: @UnsafeVariance T) {
        this.t = t
    }
}

fun main() {
    var myStorage:MyStorage<Int> = MyStorage(5)
    var myStorage2:MyStorage<Any> = myStorage
    println(myStorage2.getValue())

    myStorage2.setValue("hello") //泛型擦除
    println(myStorage2.getValue())
    println("---------")

    var myStorage3:MyStorage2<Any> = MyStorage2("world")
    var myStorage4:MyStorage2<String> = myStorage3
    println(myStorage4.getValue())
    myStorage4.setValue("123")
    println(myStorage4.getValue())

}

class MyStorage2<in T>(private var t: T) {
    fun getValue(): @UnsafeVariance T {
        return this.t
    }

    fun setValue(t: T) {
        this.t = t
    }
}