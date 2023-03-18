package functions

fun main() {

    val r = calculate(20, 10)
    println(r)

    calculate(20, 10)
}

private fun calculate(a: Int, b: Int): Int {
    return a + b
}
