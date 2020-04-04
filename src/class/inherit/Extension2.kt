package `class`.inherit

class MyExtensionProperty

val MyExtensionProperty.name:String
    get() = "hello"

fun main() {
    var myExtensionProperty:MyExtensionProperty = MyExtensionProperty()
    println(myExtensionProperty.name)
}