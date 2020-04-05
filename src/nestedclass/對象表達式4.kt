package nestedclass

/*
* 類似於Java的匿名內部類,Kotlin對象表達式中的代碼是可以放問外層的變量
* 與Java不同的是，外層變量無需聲明final
* */

fun main() {
    var i = 100

    var myObject = object {
        fun myMethod(){
            i++
        }
    }
    myObject.myMethod()
    println(i)
}