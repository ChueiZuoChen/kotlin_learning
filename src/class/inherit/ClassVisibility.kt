package `class`.inherit

/*
* 可見性 visibility
* Kotlin提供了四種可見性修飾符： private, protected, internal, public
* */

fun method(){

}

open class Classz{
    private val b = 3

    protected open val c = 4

    internal val d = 5
}

class SubClass:Classz(){

}

class SubClass2 {

}