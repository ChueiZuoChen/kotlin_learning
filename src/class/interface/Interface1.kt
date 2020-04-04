package `class`.`interface`

interface A {
    fun method() {
        println("A")
    }
}

open class B{
    open fun method(){
        println("B")
    }
}

/*當父類與interface同時擁有同樣簽名的方法，就必須明確地表示要調用哪一個的方法*/
class C : A,B() {
    override fun method() {
        super<A>.method()
        super<B>.method()
        println("C")
    }
}

fun main() {
    val c = C()
    c.method()
}