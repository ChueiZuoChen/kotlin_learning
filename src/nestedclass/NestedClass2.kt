package nestedclass

/* 內部類 Inner Class
*  關於嵌套類與內部類支籤的區別與聯繫：
*  1. 嵌套類： 對應於Java的靜態內部類(即有static 關鍵字修飾的內部類)，
*  只要在一個類的內部定義了另外一個類，那麼這個類就叫做嵌套類，相當於Java當中由static 關鍵字修飾的內部類
*
*  2. 內部類： 對應於Java的非靜態內部類(即沒有static 關鍵字修飾的內部類)，
*  使用inner 關鍵字在一個類的內部所定義的另外一個類就叫做內部類，相當於Java中沒有static 關鍵字修飾的內部類
*
*
* */

class OuterClass2{
    private var str:String = "hello world"
    //內部類
    inner class InnerClass{
        fun innerMethod() = this@OuterClass2.str

    }

    //局部嵌套類
    fun getName():String {
        class LocalNestedClass{
            val name:String = "my test"
        }
        var localNestedClass = LocalNestedClass()
        return localNestedClass.name
    }
}

fun main() {
    println(OuterClass2().InnerClass().innerMethod())
    println(OuterClass2().getName())
}