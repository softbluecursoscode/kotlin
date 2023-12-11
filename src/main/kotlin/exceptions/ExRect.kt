package exceptions

/**
 * EXERCÍCIO
 * ---------
 *
 * Crie uma classe Rect para representar um retângulo. O retângulo deve receber dois valores de lado quando for criado,
 * e os lados não podem ser 0 ou com valor negativo. Nestes casos, uma IllegalArgumentException deve ser lançada.
 */
fun main() {
    val rect = Rect(0.0, 2.0)
    println(rect)
}

data class Rect(val width: Double, val height: Double) {

    init {
        require(width > 0)
        require(height > 0)
    }
}