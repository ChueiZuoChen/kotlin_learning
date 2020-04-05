package delegation

//延遲屬性(lazy)：指的是屬性只在第一次被訪問的時候才會計算，之後則會將之前的計算結果緩存起來供後續調用

/*
* 1. SYNCHRONIZED: 默認情況下，延遲屬性是同步的: 直指會在一個線程中得到計算，所有線程都會使用相同的一個結果
* 2. PUBLICATION: 如果不需要初始化委託的同步，這樣多個線程可以同時執行
* 3. NONE: 如果確定初始化操作只會在一個線程中執行，這樣會減少縣城安全方面的開銷
* */
val myLazyValue :Int by lazy(LazyThreadSafetyMode.NONE) {
    println("hello world")
    30
}

//hello world 只會執行一次！！！因為他會調用之前的緩存結果
fun main() {
    println(myLazyValue)
    println(myLazyValue)
}
