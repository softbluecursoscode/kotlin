package collectionlambda

/**
 * OBJETIVO
 * --------
 *
 * Criar um mapa a partir da lista de pessoas, onde o nome da pessoa é a chave e o valor é o próprio objeto Person.
 */
fun main() {
    Person
        .data()
        .associateBy { it.name }
        .forEach { (n, a) -> println("$n => $a") }
}
