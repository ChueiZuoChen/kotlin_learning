package nestedclass
/*
*  Kotlin訪問外部類變量的方式： this@OuterClass.str
*  Java訪問外部變量的方式： OuterClass.this.str
* */
class Person(val name: String, var age: Int) {
    private val str:String = "Person屬性"
    private inner class PersonFeature(var height: Int, var weight: Int) {
        private  val str:String = "PersonFeature屬性"
        fun getPersonFeature() {
            val str:String = "局部變量"
            println("身高:$height, 體重:$weight")
            println(this@Person.str)
            println(this.str)
            println(str)
            //當創好了外部類實例，這時候內部類會自動持有外部類的引用，所以可以透過this@Person 調用外部類的method()方法
            this@Person.method()
        }
    }

    private fun method() {
        println("執行了Person method方法")
    }

    fun getPerson(){
        val personFeature = PersonFeature(120,180)
        personFeature.getPersonFeature()
    }
}

fun main() {
    val person = Person("czchen",20)
    person.getPerson()
}