package collections

/**
 * EXERCÍCIO
 * ---------
 *
 * Crie um mapa que mapeia códigos telefônicos aos seus países associados. A partir deste mapa, gere uma lista mutável
 * que contém os países associados a estes códigos ordenados em ordem alfabética decrescente.
 */
fun main() {

    val countries = mapOf(
            55 to "Brazil",
            351 to "Portugal",
            54 to "Argentina",
            1 to "United States"
        )
        .values
        .toSortedSet(Comparator.reverseOrder())
        .toMutableList()

    println(countries)
}
