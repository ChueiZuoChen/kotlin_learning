package lambda

/*
*   Kotlin嚴格區分可變集合跟不可變集合
*   要清楚的一點是： 區分開可變集合的只讀視圖與實際上真正的不可變集合
* */

fun main() {
    val stringList: MutableList<String> = mutableListOf("hello", "hello world")
    val readOnlyView: List<String> = stringList
    println(readOnlyView)
    println(stringList)
    stringList.add("welcome")
    println(readOnlyView)
    println(stringList)
    println("------------")

    //HashSet裡面的元素是不重複的
    val strings:HashSet<String> = hashSetOf("a","b","c","c")
    println(strings.size)
    println("------------")

    //只讀類型是協變的，因為他只用於從集合中獲取數據，而不是修改集合中的數據
    val s = listOf("a","b")
    val s2:List<Any> = s
    println("------------")

    //快照 Snapshot
    val items = mutableListOf("a","b","c")
    val items2 = items.toList() //把MutableList轉換成List
    items.add("d")
    println(items)
    println(items2)
    //toList() 擴展方法只是複製原集合中的元素，所以返回的集合就可以確保不會發生變化
}
















