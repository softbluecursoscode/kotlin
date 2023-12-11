package collections

fun main() {

    val codesMap = sortedMapOf(
        Comparator.reverseOrder(),
        55 to "Brazil",
        351 to "Portugal",
        54 to "Argentina",
        1 to "United States"
    )

    println(codesMap)
}
