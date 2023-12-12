package collectionlambda

/**
 * OBJETIVO
 * --------
 *
 * Construir uma lista apenas com as pessoas com idade maior ou igual a 18 anos.
 */
fun main() {

    Person
        .data()
        .filter { it.age >= 18 }
        .forEachIndexed { i, p -> println("${i + 1}. $p") }
}
