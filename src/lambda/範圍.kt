package lambda

fun main() {
    var i = 4
    if (i in 1..5){
        println(i)
    }
    println("------------")
    for (a in 1..4){
        println(a)
    }
    println("------------")

//    for (a in 4..1)  a = 4, a<=1 不存在所以沒有執行
    for (a in 4 downTo 1){
        println(a)
    }
    println("------------")

    for (a in 1..6 step 2){
        println(a)
    }

    println("------------")

    for (a in 6 downTo 1 step 2){
        println(a)
    }

    println("------------")

    for (a in 1 until 6){ //1,2,3,4,5 不包含6
        println(a)
    }


}