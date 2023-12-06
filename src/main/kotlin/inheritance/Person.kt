package inheritance

fun main() {

    val person1 = Person("Pedro", "Oliveira", 25)
    val person2 = Person("Pedro", "Oliveira", 25)

    println(person1)
    println(person1 == person2)

    val person3 = person2.copy()
    println(person3)
}

data class Person(
    val firstName: String,
    val lastName: String,
    val age: Int
)
