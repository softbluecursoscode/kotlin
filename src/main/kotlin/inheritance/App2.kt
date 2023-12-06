package inheritance

fun main() {

    val cat = Cat("Branco")
    val dog = Dog("Preto")

    cat.miau()
    cat.eat()
    println(cat.color)

    dog.bark()
    dog.eat()
    println(dog.color)

    var animal: Animal = dog
    val animal2: Animal = Cat("")
}
