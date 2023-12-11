package lambda

fun main() {

    val (f,s) = "aFGgKTktoiuSfklLKOsj".partition { it.isUpperCase() }

    println("First: $f")
    println("Second: $s")
}
