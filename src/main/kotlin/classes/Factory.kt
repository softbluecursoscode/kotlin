package classes

fun main() {

    var car1 = Factory.newCar()
    var car2 = Factory.newCar()
    var car3 = Factory.newCar()

    println(Factory.instanceCount)

    
}

object Factory {
    var instanceCount = 0

    fun newCar(): Car {
        instanceCount++
        return Car()
    }
}

class Car