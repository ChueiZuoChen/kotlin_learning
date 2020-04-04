package `class`.inherit

import java.util.*
import kotlin.collections.ArrayList

/*擴展的作用域
* 1. 擴展函數所定義在的類實例叫做分發接收者(dispatch receiver)
* 2. 擴展函數所擴展的那個類的實例叫做擴展接收者(extension receiver)
* 3. 當以上兩個名字如果出現衝突時，那麼擴展接收者的優先級最高
* */
class DD { //擴展接收者
    fun method(){
        println("DD method")
    }
}

class EE { //分發接收者
    fun method2(){
        println("EE method")
    }
    /*在EE類裡面擴展DD的方法
    * 在DD的hello擴展當中可以使用DD已經擁有的method，除此之外她還可以使用定義這個擴展方法所在的類，這就叫做分發接收者
    * 換句話說他可以調用method2*/
    fun DD.hello(){
        method()
        method2()
    }
    fun world(dd:DD){
        dd.hello()
    }
    fun DD.output(){
        /*因為DD和EE都有默認的toString()方法，在擴展裡面重名所以他會調用優先級最高的擴展接收者DD*/
        println(toString())
        /*如果要調用EE自己的toString()方法則必須使用關鍵字this@EE，用於標示是EE類別的this的toString()方法*/
        println(this@EE.toString())
    }

    fun test(){
        var dd = DD()
        dd.output()
    }
}

fun main() {
    var dd = DD()
    /*dd.output()和dd.hello()因為是被定義在EE裡面所以他無法去使用*/
    EE().world(dd)
    EE().test()

    val arr = getList()
    for (i in arr.indices){
        println("arr[$i]=${arr[i]}")
    }

    val list = arrayListOf<Int>(3,1,6)
    list.sort()
    list.forEachIndexed { index, i ->
        println("list[$index]=$i")
    }
}

/* 擴展可以很好得解決Java中充斥的各種輔助類問題
* Collections.swap(list,4,10)
* ->list.swap(4,10)
* Collections.binarySearch(...)
* ->list.binarySearch(...)
* */

fun getList():List<Int>{
    val arrayList = arrayListOf<Int>(1,5,2)
    Collections.sort(arrayList, kotlin.Comparator { x, y -> x-y })
    return arrayList
}

fun ArrayList<Int>.sort(){
    Collections.sort(this, kotlin.Comparator { x, y -> x-y })
}
