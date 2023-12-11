package collections

fun main() {

    val l1 = listOf(1, 2, 3, 4, 5)
    val l2: List<Int> = emptyList()
    val l3 = mutableListOf(1, 2, 3, 4)
    val l4 = listOfNotNull(1, 2, 3, null, 5, 6)

    l3.add(1, 20)
    l3.add(10)

    l4.forEach { println(it) }
}
