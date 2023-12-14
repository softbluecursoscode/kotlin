package ooadvanced

fun main() {

    val p1 = Point(10, 5)
    val p2 = Point(5, 3)
//    val p3 = p1 + p2
//    val p4 = p2 - p3
//    val p5 = p1 * 2

    val p3 = p1.plus(p2)
    val p4 = p2.minus(p3)
    val p5 = p1.times(2)

    var p6 = Point(0, 0)
    p6++

    println(p1)
    println(p2)
    println(p3)
    println(p4)
    println(p5)
    println(p6)

    val s = "A".plus("B")
    val i = (10).inc()
}

data class Point(val x: Int, val y: Int) {

    operator fun plus(other: Point): Point {
        return Point(x = x + other.x, y = y + other.y)
    }

    operator fun minus(other: Point): Point {
        return Point(x = x - other.x, y = y - other.y)
    }

    operator fun times(multiplier: Int): Point {
        return Point(x = x * multiplier, y = y * multiplier)
    }

    operator fun inc(): Point {
        return Point(x = x + 1, y = y + 1)
    }
}
