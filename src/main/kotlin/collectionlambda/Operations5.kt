package collectionlambda

/**
 * OBJETIVO
 * --------
 *
 * Obter a quantidade de pessoas cujo nome começa com a letra 'R'.
 */
fun main() {

//    val count = Person
//        .data()
//        .filter { it.name.uppercase().startsWith("R") }
//        .count()
//    println(count)

    val count = Person
        .data()
        .count { it.name.uppercase().startsWith("R") }

    println(count)
}
