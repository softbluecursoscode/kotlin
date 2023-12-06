package inheritance

abstract class Animal(
    val color: String
) {

    fun eat() {
        println("Eating")
    }

    protected fun sleep() {
        println("Sleeping")
    }
}

class Dog(color: String) : Animal(color) {

    fun bark() {
        println("Au-Au")
        sleep()
    }
}

class Cat(color: String) : Animal(color) {

    fun miau() {
        println("Miau")
    }
}
