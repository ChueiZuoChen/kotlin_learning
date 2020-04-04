package sealedclass

/*
* 密封類 sealed class
* 密封類跟他的子類只能放在同一個文件當中，可是密封類的間接子類，例如有一個類去繼承密封類的子類Add()，
* 那麼那個繼承的子類與密封類的子類就可以用在任何一個文件裡面
* */

sealed class Calculator

open class Add : Calculator()

//可以把密封類的子類用在任何一個文件裡呼叫
class Add2: Add()

class Subtract : Calculator()

class Mutiply : Calculator()

fun calculate(a: Int, b: Int, cal: Calculator) = when (cal) {
    is Add -> a + b
    is Subtract -> a - b
    is Mutiply -> a * b
}

fun main() {
    println(calculate(1, 2, Add()))
    println(calculate(1, 2, Subtract()))
    println(calculate(1, 2, Mutiply()))
}