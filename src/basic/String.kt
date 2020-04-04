package basic

fun main() {
    /*正常換行需要加入換行字元，當印出資料多的時候就需要很多切換行的符號造成可讀性降低*/
    var a: String = "hellow \n world"
    println(a)
    println("-------")

    /*三個雙引號 可以原封不動的把字串印出來*/
    var b: String = """hello
        \n world
        welcome
    """
    println(b)
}