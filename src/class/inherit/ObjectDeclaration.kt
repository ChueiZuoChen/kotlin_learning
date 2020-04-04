package `class`.inherit

/*object declaration，對象聲明*/

//意味著我聲明了一個對象，然後這個對象可以擁有屬性也可以擁有方法的
object MyObject {
    fun method() {
        println("method")
    }
}

/*因為MyObject本身就是對象實體了，不需要像類一樣還需要去創建他的實體(val myObject = MyObject())*/
fun main() {
    MyObject.method()
    println("--------")
    MyTest.method() // 類似於靜態方法調用，Kotlin中沒有靜態方法
    println("${MyTest.a}")

    /*val v = MyTest.MyObject
    println(v.javaClass)*/

}

/*compaion object，伴生對象 -> 所謂的伴生對象就是說它位於一個類當中的，隨著類的存在而存在，所以稱作伴生對象
* 如果一個類當中，他擁有一個靜態方法(static)，顯然地這個方法可以透過類的名字或是實例來調用這個方法
* 但是在Kotlin中與Java不同的是，類沒有static方法的。
* 在大多數情況下Kotlin推薦的做法是使用包級別的函數來作為靜態方法(靜態方法我們可以把它當作成全局方法，可以在各處被存取)
* 所以Kotlin會將包級別的函數當作靜態方法來看待*/

class MyTest {
    /*MyObject是伴生著MyTest這個類而存在的，並且在一個類裡面只能有一個伴生對象*/
    companion object MyObject {
        var a: Int = 100

        /*雖然半生對象的成員看起來像Java中的靜態成員，但在運行期他們依舊是真實對象的實例成員，
        * 如果想要成為真正的靜態方法，在JVM上可以將伴生對象的成員真正成為類的靜態方法與屬性，這是通過@JvmSatatic註解來實現的
        * 伴生對象在編譯後會生成一個靜態內部類*/
//        @JvmStatic
        fun method() {
            println("method invoked!")
        }
    }
}

