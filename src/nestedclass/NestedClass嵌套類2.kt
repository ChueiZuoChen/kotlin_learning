package nestedclass

class OuterClass4 {

    class NestedClass4 {
        init {
            println("Nested Class 4 構造塊")
        }
    }
}

fun main() {
    //證明嵌套類是一個靜態類
    //外部類不需要創建實體即可以創建嵌套類實體
    var nestedClass4:OuterClass4.NestedClass4 = OuterClass4.NestedClass4()

}