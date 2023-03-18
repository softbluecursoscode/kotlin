package nullable

fun main() {

    val s: String? = "abcde"
    val i = s!!.reversed()

    println(i)
}
