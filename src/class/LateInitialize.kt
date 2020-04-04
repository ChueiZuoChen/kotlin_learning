package `class`

/*
* 延遲初始化屬性
* Kotlin要求非空類型的屬性必須要在構造方法中進行初始化
* 有時，這種要求不太方便，比如可以通過依賴注入或是單元測試情況下進行給值
*
* 通過lateinit關鍵字標屬性為延遲初始化，需要滿足如下3個條件
* 1. lateinit只能用在類體中聲明的var屬性上，不能用在primary constructor聲明的屬性上
* 2. 屬性不能擁有自定義的setter與getter
* 3. 屬性類型需要是非空的，並且不能是原生數據類型
* */
class TheClass {
    lateinit var name: String

    fun init() {
        this.name = "czchen"
    }

    fun print() {
        println(this.name)
    }
}

fun main() {
    val theClass = TheClass()

    theClass.init()
    theClass.print()
}