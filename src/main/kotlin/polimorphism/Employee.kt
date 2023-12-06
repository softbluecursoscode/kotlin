package polimorphism

fun main() {

    val a: Programmer = Programmer()
    a.work()

    val b: KotlinProgrammer = KotlinProgrammer()
    b.work()

    val c: Programmer = KotlinProgrammer()
    c.work()

    val d: Programmer = KotlinProgrammer()
    val e: Programmer = Programmer()
    d.work()
    e.work()
}

abstract class Employee {

    abstract fun work()
}

open class Programmer : Employee() {

    override fun work() {
        println("Programmer working...")
    }
}

class KotlinProgrammer : Programmer() {

    override fun work() {
        println("Kotlin programmer working...")
    }
}

class Teacher : Employee() {

    override fun work() {
        println("Teacher working...")
    }
}
