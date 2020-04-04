package generics

/*
    Kotlin: 聲明處協變;  Java:使用畜協變

    Kotlin中的out關鍵字叫做 variance annotation, 因為他是在類型參數聲明處所指定的
    因此我們稱之為聲明處協變 (declaration-site variance)

    對於Java來說則是使用處協變 (use-site variance) 其中類型通配符使得類型協變成為可能
*/

/*  如果泛型類只是將泛行類型作為其方法的輸出類型，那麼我們就可以使用out
    produce = output = out
 */
interface Producer<out T> {
    fun produce(): T
}

/*  如果泛行類只是將泛行類型作為其方法的輸入類型，那麼我可以就可以使用in
    consumer = input = in
* */

interface Consumer<in T> {
    fun consume(value: T)

}

/*  如果泛行類同時將泛行類型作為其方法的輸入與輸出類型，那麼我們就不能使用out與in來去修飾泛型

* */

interface ProducerConsumer<T> {
    fun producer(): T
    fun consumer(value: T)
}


/*--------------------------------*/

open class Fruit

open class Apple : Fruit()

class ApplePearl : Apple()


class FruitProducer : Producer<Fruit> {
    override fun produce(): Fruit {
        println("Produce Fruit")
        return Fruit()
    }
}

class AppleProducer : Producer<Apple> {
    override fun produce(): Apple {
        println("Produce Apple")
        return Apple()
    }
}

class ApplePearlProducer : Producer<ApplePearl> {
    override fun produce(): ApplePearl {
        println("Produce ApplePearl")
        return ApplePearl()
    }
}

fun main() {
    // 對於"out"泛型來說，我們可以將子類型對象賦給父類型引用
    val producer1:Producer<Fruit> = FruitProducer()
    val producer2:Producer<Fruit> = AppleProducer()
    val producer3:Producer<Fruit> = ApplePearlProducer()

    println("--------------")
    // 對於"in"泛型來說，我們可以將父類型對象賦給子類型引用
    val consumer1: Consumer<ApplePearl> = Human()
    val consumer2: Consumer<ApplePearl> = Man()
    val consumer3: Consumer<ApplePearl> = Boy()

}

class Human: Consumer<Fruit>{
    override fun consume(value: Fruit) {
        println("Consume Friut")
    }
}

class Man: Consumer<Apple> {
    override fun consume(value: Apple) {
        println("Consume Apple")
    }
}

class Boy: Consumer<ApplePearl> {
    override fun consume(value: ApplePearl) {
        println("Consume ApplePearl")
    }
}
















