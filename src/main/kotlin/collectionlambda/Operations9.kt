package collectionlambda

/**
 * OBJETIVO
 * --------
 *
 * Procurar na lista uma pessoa com determinado nome. Retornar a idade dessa pessoa se ela for encontrada, caso
 * contrário retornar 0.
 */
fun main() {
//    val age = Person
//        .data()
//        .find { it.name == "Roberto" }
//        ?.age
//        ?: 0
//
//    println(age)

    val age = Person
        .data()
        .firstOrNull { it.name == "Romeu" }
        ?.age
        ?: 0

    println(age)
}
