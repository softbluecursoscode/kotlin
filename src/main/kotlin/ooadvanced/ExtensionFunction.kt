package ooadvanced

fun main() {

    val sum = listOf(1, 2, 3, 4, 5, 6, 7).sumEvenNumbers()
    println(sum)
}

//fun sumEvenNumbers(list: List<Int>): Int {
//    return list.filter { it % 2 == 0 }.sum()
//}

fun List<Int>.sumEvenNumbers(): Int {
    return this.filter { it % 2 == 0 }.sum()
}