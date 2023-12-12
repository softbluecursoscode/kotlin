package collectionlambda

/**
 * OBJETIVO
 * --------
 *
 * Criar um mapa a partir da lista de pessoas, mapeando a primeira letra do nome à lista de pessoas cujo nome começa
 * com aquela letra.
 */
fun main() {
    Person
        .data()
        .groupBy({ it.name[0] }, { it.name })
        .forEach { (n, a) -> println("$n => $a") }
}
