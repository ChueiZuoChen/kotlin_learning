package `class`.inherit

/*在Kotlin中，所有類在默認情況下都是無法被繼承的，
* 換句話說，在Kotlin中，所有累默認情況下都是final的
* open的涵義與final相反*/

open class Parent(name: String, age: Int) {

}

/*Child的構造方法接收了兩個參數，必須也要一並的傳給父類別*/
class Child(name: String, age: Int) : Parent(name, age) {

}

open class Parent2(name: String) {

}

/*如果一個類沒有primary構造方法，那麼這個類的每個secondary構造方法就需要通過super關鍵字來初始化父類別，
* 或是通過其他secondary構造方法完成這個任務，不同的secondary構造方法可以調用附類型不同的構造方法*/
class Child2 : Parent2 {

    constructor(name: String) : super(name) {

    }
}