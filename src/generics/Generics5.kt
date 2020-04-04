package generics

// star projection (星投影)

// Star<out T>: 如果 T 的上界TUpper,那麼Star<*> 就相當於 Star<out T>,
// 這表示當T的類型為之時,你可以安全地讀取TUpper類型的值從Star<*>當中

// Star<in T>: Star<*> 就相當於 Star<in Nothing>,Nothing是一個不存在任何實例的類型
// 這表示你無法向其中寫入任何值

// Star<T>: 如果T的上界為TUpper,那麼Star<*>就相當於讀取時的Star<out TUpper>以及寫入時的Star<in Nothing>

class Star<out T> {

}

class Star2<in T> {
    fun setValue(t: T) {

    }
}

class Star3<T>(private var t: T) {
    fun setValue(t: T) {
        this.t = t
    }

    fun getValue(): T {
        return this.t
    }
}

fun main() {
    val star: Star<Number> = Star<Int>()
    val star2: Star<*> = star

    val star3: Star2<Int> = Star2<Number>()
    val star4: Star2<*> = star3
//    star4.setValue(3)  //compile error

    val star5: Star3<String> = Star3<String>("hello")
    val star6: Star3<*> = star5
    star6.getValue()
//    star6.setValue("12") //compile error

    val list: MutableList<*> = mutableListOf("hello", "world", "hello world")
    println(list[0])
//    list[0] = "test" //compile error


}










