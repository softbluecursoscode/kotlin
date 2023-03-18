package classes

/**
 * EXERCÍCIO
 * ---------
 *
 * Crie uma classe Person para representar uma pessoa. Uma pessoa pode andar e, toda vez que anda, ela anda 1000m
 * de uma só vez. Ao percorrer 5000m, ela não consegue mais andar e só volta a andar se tomar água (depois disso
 * ela pode andar mais 5000m).
 *
 * Crie um programa que simula a caminhada de uma pessoa durante determinado período, mostrando ao final qual foi
 * a distância percorrida.
 *
 * Como bônus, experimente parametrizar a distância de 5000m até ela tomar água, o que vai permitir criar pessoas
 * mais e menos resistentes à caminhada.
 *
 */
fun main() {
    val p1 = Person()

    p1.walk()
    p1.walk()
    p1.walk()
    p1.walk()
    p1.walk()
    p1.drinkWater()
    p1.walk()
    p1.walk()
    p1.walk()
    p1.walk()
    p1.walk()
    p1.drinkWater()
    p1.walk()

    println("A pessoa andou ${p1.end()}m")

    val p2 = Person(1000)
    p2.walk()
    p2.drinkWater()
    p2.walk()
    println("A pessoa andou ${p2.end()}m")
}

private class Person(
    private val initialDistanceToWater: Int = 5000
) {
    private var distance = 0
    private var distanceToWater: Int = initialDistanceToWater

    fun walk() {
        if (distanceToWater > 0) {
            distance += 1000
            distanceToWater -= 1000
        }
    }

    fun drinkWater() {
        distanceToWater = initialDistanceToWater
    }

    fun end(): Int {
        return distance
    }
}