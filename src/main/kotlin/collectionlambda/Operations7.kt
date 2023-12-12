package collectionlambda

/**
 * OBJETIVO
 * --------
 *
 * Somar a idade de todas as pessoas.
 */
fun main() {

    val sum = Person
        .data()
        .map { it.age }
        .reduce { acc, age -> acc + age }

    println(sum)
}
