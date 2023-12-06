package polimorphism

fun main() {
    val square = Square()
    println(square.vertexNumber)

    val triangle = Triangle()
    println(triangle.vertexNumber)
}

abstract class Shape {
    open val vertexNumber: Int = 0
}

class Square : Shape() {
    override val vertexNumber: Int = 4
}

class Triangle(override val vertexNumber: Int = 3) : Shape()
