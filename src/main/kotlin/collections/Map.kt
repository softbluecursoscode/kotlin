package collections

fun main() {

//    val map1 = mapOf(
//        Pair(1, "A"),
//        Pair(2, "B")
//    )

    val map1 = mapOf(1 to "A", 2 to "B")
    println(map1)

    val v1 = map1[1]
    println(v1)

    val map2 = map1.toMutableMap()
    map2[3] = "C"
    map2[1] = "Z"
    println(map2)
}
