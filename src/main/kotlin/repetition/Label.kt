package repetition

fun main() {

    loop@ for (i in 'A'..'E') {
        for (j in 1..5) {
            print("$i$j ")

            if (j == 3) {
                //break@loop
                continue@loop
            }
        }
        println()
    }

    println("\nFIM")
}
