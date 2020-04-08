@file:JvmName("HelloKotlin")

package lambda

import kotlin.reflect.KClass

//註解也可以擁有自己的構造方法，並且構造方法也可以接收參數
/*
*   註解構造方法所允許的參數類型：
*   原生類型所對應的類型(Int, Long....)
*   字符串: String
*   classes (MyClass::class)
*   枚舉: enums
*   其他的註解
*   上述類型的數組類型
*
*   Kotlin的註解參數是不允許為可空類型的，因為JVM不支持以null的形式存儲註解屬性值的
*
*   如果某個註解被用作其他註解的參數，那麼其名字就不需要以 @ 字符開頭
* */
annotation class MyAnnotation2(val str: String)

@MyAnnotation2("hello")
class MyClass4

annotation class MyAnnotation3(val str: String, val myAnnotation: MyAnnotation2)

@MyAnnotation3("test", MyAnnotation2("world"))
class MyClass5

/*
*   如果需要將某個class作為註解的參數，那麼請使用kotlin class(KClass)
*   Kotlin編譯器會自動將其轉換為Java Class
*   這樣，Java代碼就可以正常看到註解與參數了
* */

annotation class MyAnnotation4(val arg1: KClass<*>, val arg2: KClass<out Any>)

@MyAnnotation4(String::class, Int::class)
class MyClass6


//註解使用處目標 use-site target
/*
*   在對類的屬性或是主構造方法的參數聲明註解時，會存在多個Java元素都可以通過對應的Kotlin元素生成出來,
*   因此，在所生成的Java字節碼中，就會存在多個可能的位置來生成相應的註解，若想精確指定如何來生成註解，那麼可以
*   使用註解的使用處目標方式來實現
* */

class MyClass7(
    @field:MyAnnotation val arg1: String, //註解Java field
    @get:MyAnnotation val arg2: String,  //註解Java getter
    @param:MyAnnotation val arg3: String  //註解Java構造方法參數
)
























