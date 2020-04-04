package generics

//泛型函數

fun <T> getValue(item:T):T{
    return item
}

fun main() {
    val item = getValue(3)
    println(item)

    val item2 = getValue("hello")
    println(item2)

    val upperBoundsClass2 = UpperBoundsClass2<String>()
}

class UpperBoundsClass<T: List<T>>{

}

//T有多個上界，他要滿足Comparable<T> 也要滿足Any
class UpperBoundsClass2<T> where T: Comparable<T>, T: Any {

}