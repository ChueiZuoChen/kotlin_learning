package `class`.inherit

/*繼承方法的重寫*/

open class Fruit {
    open fun name(){
        println("fruit")
    }
    fun expairationDate(){
        println("1 month")
    }
}

/*Apple繼承父類，而父類是open所以繼承沒問題
* 可是當要重寫(override)父類的方法也必須把父類的方法加上open*/
class Apple:Fruit(){
    override fun name(){
        println("apple")
    }
}

/*Orange裡面的name()是繼承了Fruit裡面的name()，
* 並且繼承並改寫後的name()無法被要繼承Orange的子類別改寫
* */
open class Orange:Fruit(){
    final override fun name() {
        println("orange")
    }
}

fun main() {
    var apple = Apple()
    apple.name()
    apple.expairationDate()
}