package selection

fun main() {

    val x = 10
    println(
        when {
            x > 0 -> "POSITIVO"
            x < 0 -> "NEGATIVO"
            else -> "ZERO"
        }
    )

    val s = 'c'

    val v = when (s) {
        'A', 'a' -> 1
        'B', 'b' -> 2
        else -> 3
    }

    println(v)
}
