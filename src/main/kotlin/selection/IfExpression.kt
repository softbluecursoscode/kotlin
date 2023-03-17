package selection

fun main() {

    val n = 10

    val r = if (n % 2 == 0) {
        println("PAR")
        "PAR"
    } else {
        println("ÍMPAR")
        "ÍMPAR"
    }

    println(r)
}
