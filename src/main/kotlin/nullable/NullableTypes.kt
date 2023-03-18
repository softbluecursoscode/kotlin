package nullable

import java.util.*

fun main() {

    var n: Int? = 10
    n = 20
    n = 30
    n = null

    var s1: String? = "abc"

    if (s1 != null) {
        val s2 = s1.uppercase(Locale.getDefault())
        println(s2)
    }
}
