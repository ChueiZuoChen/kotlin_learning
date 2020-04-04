package generics

/*泛型 generics，表示變量類型的參數化 */

class MyGeneric<T>(t: T) {
    var variable: T

    init {
        this.variable = t
    }
}

fun main() {
//    var myGeneric = MyGeneric<String>("hello world")
    var myGeneric = MyGeneric("hello world")/*借助於Kotlin泛型強大的類型推斷*/
    println(myGeneric.variable)
    println("---------")
    var myClass = MyClass<String, Number>("abc", 2)
    myTest(myClass)
}

class MyClass<out T, in M>(t: T, m: M) {
    private var t: T
    private var m: M

    init {
        this.t = t
        this.m = m
    }

    fun get(): T = this.t

    fun set(m: M) {
        this.m = m
    }
}
                                                  //             out     in
fun myTest(myClass: MyClass<String, Number>) {    //傳入 MyClass<String,Number>
    var myObject: MyClass<Any, Int> = myClass     //接收 MyClass<Any,Int>
    println(myObject.get())
}


//泛型的"協變" (covariant) 與 "逆變"(controvariant)
/*關於協變與逆變的概念及來源
    List<Object>
    List<String>

    List<String> list = new ArrayList();
    List<Object> list2 = list //編譯失敗，java不允許我們這樣去做的

    list2.add(new Date()) // 我們給他添加了日期類型

    String str = list2.get(0) //因為list2是List<String>類型的我們拿出來的是String類型，
    可是卻把內容日期類型的給string類型，這時候會出現轉型錯誤。

    所以java提供了一種通配符的概念
    List<? extends Object> list ...
    <? extends Object>意思就是我放進去的類型就是 ? 繼承 Object 也就是說放進去是Object或是Object的子類都是可以的
    他限制了泛行的可用類型是什麼類型

    interface Collection<E>{
        void addAll(Collection<E> item);
    }

    void copyAll(Collection<Object> to, Collection<String> from){
        to.addAll(from);
    }

    interface Collection<E> {
        void addAll(Collection<? extends E> item);
    }

    Collection<String>就是 Collection<? extends Object> 的子類型 -> 這種類型我們限制了上界(Upper bound)只能放Object類型以下的所有類型，我們稱之為協變
    (但他絕對不是 Collection<Object> 的子類型)

    List<? super String> -> 這種類型我們使用super限制了下界 (Lower bound)只能放String類型以上的所有類型，我們稱之為逆變
    這裡面的類型只能是String或是String以上的類型

    我們如果只從中讀取數據，而不是往裡面寫入內容，那麼這樣的對象叫做生產者; 如果只向裡面寫入數據，而不從中讀取數據，那麼這樣的數據叫做消費者。
    生產者使用 ? extends E; 消費者使用 ? super E

    可以認為 1. 協變本身是用於讀取的
            2. 逆變本身是用於寫入的
*/