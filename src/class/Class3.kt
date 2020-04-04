package `class`

/*類的屬性或成員變量宣告可以直接在主構造方法裡面*/
class Student(private val username: String, private val age: Int, private var address: String) {
    fun printInfo() {
        println("username: $username, age: $age, address: $address")
    }
}

/*如果構造方法擁有註解或是可見性修飾符，那麼constroctor關鍵字就是不能省略掉的，並且它位於修飾符後面*/
class Student2 private constructor(username: String) {

}

/*在JVM上，如果類的primary構造方法的所有參數都擁有默認值，那麼kotlin編譯器就會為這麼累升成一個不帶餐數的構造方法，
* 這個不帶參數的構造方法就會使用這些參數的默認值，這樣做的目的在於可以跟其他框架更好的集成
* */
class Student3(val username: String = "cz") {

}

fun main() {
    val student = Student("cz", 20, "taipei")
    student.printInfo()

    var student3 = Student3()
    println(student3.username)
    student3 = Student3("123")
    println(student3.username)
}