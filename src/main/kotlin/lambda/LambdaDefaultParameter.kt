package lambda

fun main() {

    val f: (Int) -> Int = {
        it * 2
    }
    println(f(6))
}
