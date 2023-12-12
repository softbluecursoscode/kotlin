package collectionlambda

/**
 * OBJETIVO
 * --------
 *
 * Construir uma lista apenas com os nomes das pessoas.
 */
fun main() {

    Person
        .data()
        .map { it.name }
        .forEach { println(it) }
}
