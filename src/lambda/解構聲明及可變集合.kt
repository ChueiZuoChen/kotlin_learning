package lambda

/*
*   解構聲明
* */

data class MyResult(val result: String, val status: Int)

fun myMethod(): MyResult {
    return MyResult("Success", 1)
}

fun myMethod2(): Pair<String, Int> {
    return Pair("Success", 1)
}

fun main() {
    val myResult = myMethod()
    println(myResult.result)
    println(myResult.status)
    println("------------")

//  在一個函數當中我們可以返回兩個或多個結果
    val (result2, status2) = myMethod()
    println(result2)
    println(status2)
    println("------------")

    val (result3, status3) = myMethod()
    println(result3)
    println(status3)
    println("------------")

    /*
    *   解構聲明及可變集合
    * */
    val map = mapOf("a" to "aa", "b" to "bb", "c" to "cc")
    for ((key, value) in map) {
        println("key:$key, value:$value")
    }
    println("------------")

    //mapValues方法就是把所有value轉換然後再放回去，key是不變的
    //mapKeys則是轉換key類型放回去，value不變

    //entry把每個值取出來加上hello然後再放回去
    map.mapValues { entry -> "${entry.value} hello" }.forEach { println(it) /*it表示map的鍵值對 "key=value"*/ }
    println("------------")

    map.mapKeys { (key, value) -> "$value world" }.forEach { println(it) }
    println("------------")

    map.mapValues { (_, value) -> "$value welcome" }.forEach { println(it) }
    println("------------")

    /*
    *   Kotlin允許我們為解構聲明整體指定類型，也可以為每個具體的component指定類型
    * */
    map.mapValues { (_, value): Map.Entry<String, String> -> "$value person" }
        .forEach { println(it) }
    println("------------")

    map.mapValues { (_, value: String) -> "$value people" }.forEach { println(it) }
}


















