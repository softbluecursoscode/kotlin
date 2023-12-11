package lambda

fun main() {

    val s1 = "fsd65jkhl5jkf09823fjkhjk0938tjkfhsa908e23yd2189678"
    val s2 = s1.filter { it.isDigit() }
    println(s2)

    val s3 = s1.filterIndexed { i, c ->
        val digit = c.isDigit()
        if (digit) {
            println("Found digit '$c' in position '$i'")
        }
        digit
    }

    println(s3)
}
