package selection

fun main() {

    val x = 4

    when (x) {
        10 -> println("É 10")
        20 -> println("É 20")
        30 -> println("É 30")
        else -> println("Desconhecido")
    }

    when (x) {
        in 0..10 -> println("0 a 10")
        in 11..30 -> println("11 a 30")
        else -> println("Outro intervalo")
    }

    when (x) {
        0, 2, 4, 6 -> println("PAR")
        else -> println("Desconhecido")
    }
}
