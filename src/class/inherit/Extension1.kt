package `class`.inherit

/*
* 擴展 extension
* */

class ExtensionTest {
    fun add(a: Int, b: Int) = a + b
    fun subtract(a: Int, b: Int) = a - b
}


fun ExtensionTest.multiply(a: Int, b: Int) = a * b

fun main() {
    var extensionTest = ExtensionTest()
    println(extensionTest.add(1, 2))
    println(extensionTest.subtract(1, 2))
    println(extensionTest.multiply(2,3))
    println("---Extension重要!!!!----")
    myPrint(AA())
    myPrint(BB())

    println("----CC-----")
    CC().foo()
    CC().foo(1)
}

/*擴展函數的解析是靜態的(static)，multuply這個方法並不會插入到ExtensionTest類裡
* 1. 擴展本身並不會真正修改目標類，也就是說他並不會再目標類中插入新的屬性或是方法
* 2. 擴展的解析是靜態分發的，而不是動態的，即不支持多態，調用只取決於對象聲明類型
* 3. 調用是由對象的聲明類型所決定的，而不是由對象實例類型決定
* */

open class AA
class BB:AA()

fun AA.a() = "a"
fun BB.a() = "b"

//因為aa的聲明類型是AA，所以你不管傳入的是AA或是他的子類BB他依舊只會調用AA的擴展
fun myPrint(aa:AA){
    println(aa.a())
}

class CC{
    fun foo(){
        println("member")
    }
}

fun CC.foo(i:Int){
    println("member2")
}

fun Any?.toString():String {
    if (this == null) {
        return "null"
    }
    return toString()
}