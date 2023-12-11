package collections

fun main() {

    val l1: List<String> = listOf("A", "B", "C")
    val l2: MutableList<String> = l1.toMutableList()

    val s1: Set<String> = l1.toSet()
    val s2: MutableSet<String> = s1.toMutableSet()
    val s3: MutableSet<String> = s2.toMutableSet()
}
