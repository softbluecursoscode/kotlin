package repetition

fun main() {

    for (i in 0..50) {

        if (i % 10 == 0) {
            continue
        }

        print("$i ")
    }
}
