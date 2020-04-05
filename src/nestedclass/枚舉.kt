package nestedclass

enum class Season {
    SPRING, SUMMER, AUTUMN, WINTER
}

enum class Season2(val temperature: Int) {
    SPRING(10), SUMMER(30), AUTUMN(20), WINTER(-10)
}

//枚舉中聲明方法
enum class Season3 {

    SPRING {
        override fun getSeason(): Season3 = SPRING
    },
    SUMMER {
        override fun getSeason(): Season3 = SUMMER
    },
    AUTUMN {
        override fun getSeason(): Season3 = AUTUMN
    },
    WINTER {
        override fun getSeason(): Season3 = WINTER
    };

    abstract fun getSeason(): Season3
}

fun main() {
    val season = Season.values()
//    season.forEach { season -> println(season) }
    season.forEach { println(it) }
    println("--------------")
    val season2 = Season.valueOf("SPRING")
    println(season2)
}