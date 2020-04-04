package `class`

class Person constructor(username: String) {
    /*主建構式裡面宣告的變數必須初始化
    * 1. 可以直接給初始值
    * 2. 或是在init區塊初始化*/
    private var username: String
    private var age: Int
    private var address: String

    init {
        println(username)
        this.username = username
        this.age = 20
        this.address = "taipei"
    }

    /*secondary建構函式是放在body裡面
    對於一個secondary建構式必須 直接 或者 間接去掉用主建構式*/
    constructor(username: String, age: Int) : this(username) {
        println("$username, $age")
        this.username = username
        this.age = age
        this.address = "taichung"
    }

    /*第三個建構式調用了第二個建構式，然後第二個建構式又調用了主建構式*/
    constructor(username: String, age: Int, address: String) : this(username, age) {
        this.address = address
    }

    fun printInfo() {
        println("username: $username, age: $age, address: $address")
    }
}

fun main() {
    /*primary constructor*/
    val person = Person("cheuizuochen")

    /*secondary constructor 2 agument*/
    val person2 = Person("cz", 30)

    /*secondary constructor 3 agument*/
    val person3 = Person("rr", 40, "tainan")
    person.printInfo()
    person2.printInfo()
    person3.printInfo()
}

