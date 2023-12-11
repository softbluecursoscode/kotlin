package collections

fun main() {

    val dogs = setOf(
        Dog("D1"),
        Dog("D2"),
        Dog("D2"),
        Dog("D3"),
        Dog("D4"),
        Dog("D4")
    )

    println(dogs)
}

data class Dog(val name: String) {
    override fun toString() = "Dog(name=$name, hashCode=${hashCode()})"
}
