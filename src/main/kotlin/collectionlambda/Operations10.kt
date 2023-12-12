package collectionlambda

/**
 * OBJETIVO
 * --------
 *
 * Procurar na lista uma pessoa com determinada idade. Retornar um booleano indicando se ela foi encontrada.
 */
fun main() {
    val existsAge = Person
        .data()
        //.any { it.age == 19 }
        //.all { it.age == 19 }
        .none { it.age == 99 }

    println(existsAge)
}
