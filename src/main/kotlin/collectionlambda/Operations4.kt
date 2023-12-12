package collectionlambda

/**
 * OBJETIVO
 * --------
 *
 * Obter 3 nomes aleatórios de pessoas.
 */
fun main() {

    Person
        .data()
        .map { it.name }
        .shuffled()
        .take(3)
        .forEach { println(it) }
}
