package collectionlambda

/**
 * OBJETIVO
 * --------
 *
 * Criar um mapa a partir da lista de pessoas, mapeando a primeira letra do nome à quantidade de pessoas cujo nome
 * começa com aquela letra.
 */
fun main() {
    Person
        .data()
        .groupingBy { it.name[0] }
        .eachCount()
        .forEach { (n, a) -> println("$n => $a") }
}
