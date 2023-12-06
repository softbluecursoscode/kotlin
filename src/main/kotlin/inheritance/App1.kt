package inheritance

fun main() {

    //val animal = Animal("Branco")
    val dog = Dog("Preto")
    val cat = Cat("Cinza")

    var a: Animal = dog
    var b: Animal = cat

    //println(animal is Animal)
    println(dog is Dog)
    println(dog is Animal)
    println(cat is Animal)
}