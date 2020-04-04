package basic

fun main() {
    var array = listOf<String>("hello","world","hello world","welcome","goodbye")
    for (item in array){
        println(item)
    }
    println("------")
    when{
        "world" in array -> println("world in collection")
    }
    println("------")

    /*
    * 1.找出長度大於五的元素
    * 2.對符合條件的元素轉換成大寫
    * 3.將轉換成大寫的字母進行自然排序
    * 4.將轉換過後的排序列印出來
    * */
    array.filter { it.length >5 }.map { it.toUpperCase() }.sorted().forEach { println(it) }
}