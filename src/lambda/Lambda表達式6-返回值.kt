package lambda

/*
*   在默認情況下，lambda表達式中最後一個表達式的值會隱式作為該lambda表達式的返回值
*   我們可以通過全限定的retrun語法來顯式的從lambda表達式返回值
* */

fun main() {

    val strings = arrayOf("hello", "world", "bye")

//  最後一個表達式會隱式返回值
    strings.filter {
        val mayFilter = it.length > 3
        mayFilter
    }

//  顯示返回給filter
    strings.filter {
        val matFilter = it.length > 3
        return@filter matFilter
    }

//  直接判斷
    strings.filter {
        it.length > 3
    }
}