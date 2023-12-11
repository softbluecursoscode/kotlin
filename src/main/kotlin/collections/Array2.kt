package collections

fun main() {

    val a1 = arrayOf("A", null, "C")
    val a2 = arrayOfNulls<String>(10)
    val a3 = intArrayOf(1, 2, 3)

    println(a1.contentToString())
    println(a2.contentToString())
    println(a3.contentToString())
}
