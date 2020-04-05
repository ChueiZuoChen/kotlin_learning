package delegation

//委託 delegation
//類委託

interface MyInterface {
    fun myPrint()
}

class MyInterfaceImpl(val str: String) : MyInterface {
    override fun myPrint() {
        println("welcome $str")
    }
}
/*
* 委託原理：
* by關鍵字後面的對象實際上會被存儲在類的內部，
* 編譯器則會把富街口中的所有方法實現出來，並且將實現轉移給委託對象來去進行
* */


// MyClass把實作MyInterface裡面的myPrint()方法 委託給MyInterfaceImpl去實作
class MyClass(myInterface: MyInterfaceImpl) : MyInterface by myInterface {
/*    override fun myPrint(){
        println("hello world")
    }*/
}

fun main() {
    val myInterfaceImpl = MyInterfaceImpl("czchen")
    MyClass(myInterfaceImpl).myPrint()
}