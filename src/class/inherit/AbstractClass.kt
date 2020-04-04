package `class`.inherit

open class BaseClass{
    open fun method(){

    }
}

/*當一個抽象類別繼承了父類別BaseClass，而子類別ChildClass繼承了抽象類別
* 子類別必須要實作抽象類別裡面定義的所有抽象方法*/
abstract class ChildClass: BaseClass(){

    override abstract fun method()
}

class A : ChildClass(){
    override fun method() {

    }
}