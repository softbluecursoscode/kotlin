package collections

fun main() {
    val s = sortedSetOf(Comparator.naturalOrder(), 1, 3, 8, 6, 2, 0, 4, 9, 5, 7)
    println(s)

    s.toSortedSet()

    val dogs = sortedSetOf(
        Comparator.comparing { d: Dog -> d.name }.reversed(),
        Dog("D4"),
        Dog("D3"),
        Dog("D1"),
        Dog("D2")
    )
    println(dogs)
}
