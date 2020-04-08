package lambda

/*
*   註解 (annotation)
*   meta-annotation (元註解)
* */

@Target(
    AnnotationTarget.CLASS,
    AnnotationTarget.FUNCTION,
    AnnotationTarget.VALUE_PARAMETER,
    AnnotationTarget.EXPRESSION,
    AnnotationTarget.CONSTRUCTOR,
    AnnotationTarget.PROPERTY_SETTER
)
@Retention(AnnotationRetention.SOURCE)
@MustBeDocumented
annotation class MyAnnotation

@MyAnnotation
class MyClass {
    @MyAnnotation
    fun myMethod(@MyAnnotation a: Int): Int {
        return (@MyAnnotation 10)
    }
}

//對constructor註解 不能省略 constructor
class MyClass2 @MyAnnotation constructor(a:Int){

}

class MyClass3 {
    var a:Int? = null
    @MyAnnotation set(value){
        field = value
    }
}
























