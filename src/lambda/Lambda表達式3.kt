package lambda

fun myCalculate(a: Int, b: Int, calculate: (Int, Int) -> Int): Int {
    return calculate(a, b)
}


fun calAdd(a: Int, b: Int): Int {
    return a + b
}

fun main() {
    println(myCalculate(3, 4, { x, y -> x + y }))
    println(myCalculate(3, 6, { x, y -> x - y }))
    println(myCalculate(3, 5, { x, y -> x * y }))

    println(myCalculate(2, 3) { x, y ->
        x + y
    })

}






