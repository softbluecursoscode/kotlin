package collectionlambda

/**
 * OBJETIVO
 * --------
 *
 * Criar um mapa a partir da lista de pessoas, onde o nome da pessoa é a chave e a idade é o valor.
 */
fun main() {
    Person
        .data()
        .associate { it.name to it.age }
        .forEach { (n, a) -> println("$n => $a") }
}
