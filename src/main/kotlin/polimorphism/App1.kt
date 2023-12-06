package polimorphism

fun main() {

}

open class Drink {

    open fun prepare() {
        println("Prepare DRINK")
    }
}

class Coffee : Drink() {

    override fun prepare() {
        super.prepare()
        println("Prepare COFFEE")
    }
}
