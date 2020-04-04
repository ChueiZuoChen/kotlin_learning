package dataclass

/*data class
* 數據類需要滿足如下要求：
* 1. 主構造方法至少要有一個參數
* 2. 所有的主構造方法參數都需要被標記為var或val成為成員變數或屬性
* 3. 數據類不能是抽象的(abstract), 可繼承的(open), 密封類(sealed)及內部類(inner)的
*
* 對於數據類來說，編譯器會自動生成如下內容：
* 1. equals/hashCode
* 2. toString()方法,形式為Person(name=.., age=.., adress=..)
* 3. 針對屬性的componentN方法，並且是按照屬性的聲明順序來生成的
*
* 關於數據類成員的繼承要點
* 1. 如果數據類中顯示定義了equals, hashCode或是toString方法，或是在數據的父類中將這些方法聲名為final,
*    那麼這些方法就不會再生成，轉而使用已有的
* 2. 如果父類擁有componentN方法，並且是open的以及返回兼容的類型，那麼編譯器就會在數據中生成相應的componentN方法，
*    並且重寫父類的這些方法; 如果父類中的這些方法由於不兼容的簽名或是被定義為final的，那麼編譯器就會報錯
* 3. 在數據類中顯示提供componentN方法以及copy方法實現是不允許的
*
* 解構聲明
* 在主構造方法中有多少個參數就會依次生成對應的component1,component2,component3,..
* 這些方法返回的就是對應字段的值，componentN方法就是用來實現解構聲明的
* */
data class Person(val name:String, var age:Int, var address:String){

}

/*
    在jvm平台上，如果生成類需要擁有無參數方法，那麼就需要為所有屬性指定默認值
*/
data class Person2(val name:String = "",var age:Int = 0, var address:String = "")

fun main() {
    var person = Person("czcheb",20,"taipei")
    println(person)
    person.age = 30
    println(person.age)

    var person2 = person.copy(address = "chinese")
    println(person2)

    //解構->就是透過component順序依次解開給變數
    var(name,age,address) = person
    println("name=$name,age=$age,addres=$address")
}