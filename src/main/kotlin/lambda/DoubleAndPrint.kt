package lambda

fun main() {

    val f: (Int) -> Int = { n: Int ->
        val d = n * 2
        println("New value: $d")
        d
    }

    f(4)
    f(20)
}
