package collectionlambda

/**
 * OBJETIVO
 * --------
 *
 * Construir uma lista com idades distintas das pessoas, ordenadas em ordem crescente.
 */
fun main() {

    Person
        .data()
        .map { it.age }
        .distinct()
        .sorted()
        .forEach { println(it) }
}
