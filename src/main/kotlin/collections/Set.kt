package collections

fun main() {

    val s1 = setOf(1, 2, 3, 4)
    val s2 = mutableSetOf("A", "B", "C")
    val s3 = hashSetOf("1A", "5B", "10C")

    s1.forEach { println(it) }
    s2.forEach { println(it) }
    s3.forEach { println(it) }
}
