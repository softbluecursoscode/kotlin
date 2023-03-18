package classes

fun main() {

    println(Math.sum(20, 10))
    println(Math().subtract(10, 4))
}

class Math {

    fun subtract(a: Int, b: Int) = a - b

    companion object {

        fun sum(a: Int, b: Int) = a + b
    }
}
