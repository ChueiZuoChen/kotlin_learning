package nestedclass

class OuterClass5{

    inner class InnerClass5(str:String){
        init {
            println(str)
        }
    }
}

fun main() {
    //外部類需要創建實體然後才可以創建內部類
    val outerClass5:OuterClass5.InnerClass5 = OuterClass5().InnerClass5("hello")

}