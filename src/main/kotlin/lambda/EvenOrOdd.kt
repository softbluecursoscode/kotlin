package lambda

fun main() {
    val f1: (Int) -> Boolean = { n: Int -> n % 2 == 0 }
    val f2 = { n: Int -> n % 2 == 0 }
    val f3: (Int) -> Boolean = { n -> n % 2 == 0 }
}
