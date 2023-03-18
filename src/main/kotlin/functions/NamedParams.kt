package functions

fun main() {
    println(pow(3.0, 2))
    println(pow(exp = 2, base = 3.0))
}

private fun pow(base: Double, exp: Int): Double {
    var r = base
    for (m in 2..exp) {
        r *= base
    }
    return r
}
