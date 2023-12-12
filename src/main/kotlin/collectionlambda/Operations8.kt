package collectionlambda

/**
 * OBJETIVO
 * --------
 *
 * Encontrar o nome de pessoa com o maior número de letras. Depois, encontrar a menor idade dentre as pessoas.
 */
fun main() {
    val maxName = Person
        .data()
        .map { it.name }
        .maxBy { it.length }
    println(maxName)

    val minAge = Person
        .data()
        .minOf { it.age }
    println(minAge)
}
