package exceptions

fun main() {

    //val x = throw IllegalArgumentException()

    val i: Int? = null

    val d = i?.toDouble() ?: throw IllegalArgumentException()

    println(d)
}
