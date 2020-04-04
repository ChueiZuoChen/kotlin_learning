package `class`.inherit

/*
     var propertyName: propertyType = initializer
         getter()...
         setter(value)...

     backing field, 支撐字段(域)
     backing property, 支撐屬性
* */

class ThePerson(address: String, name: String) {
    /* val唯讀一但被初始化就無法被變動的只有get()方法*/
    val age: Int
        get() = 20
    /* var可變動的變數宣告擁有get()和set()*/
    var address: String = address
        get() {
            println("get invoked")
            return field
        }
        set(value) {
            println("set invoked")
            field = value
        }
    var name:String = name
}

fun main() {
    var thePerson = ThePerson("taipei", "czchen")
    println(thePerson.age)
    println(thePerson.address)
    thePerson.address = "123"
    println(thePerson.address)

    println(thePerson.name)
    thePerson.name = "chencz"
    println(thePerson.name)
}
