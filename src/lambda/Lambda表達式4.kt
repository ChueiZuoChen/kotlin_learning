package lambda

import java.lang.StringBuilder


fun String.filter(predicate:(Char)->Boolean):String{
    val sb = StringBuilder()
    for (index in 0 until length){
        val element = get(index)
        if (predicate(element)){
            sb.append(element)
        }
    }
    return sb.toString()
}

fun main() {
    val str = "1a2s3rt45hu"
    println(str.filter { it.isLetter() })
    println(str.filter { it.isDigit() })
}

