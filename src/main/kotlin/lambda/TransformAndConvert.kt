package lambda

fun main() {
    val r1 = transformAndConvert("$", "|", 100, { v -> v * v })
    println(r1)

    val r2 = transformAndConvert("$", "|", 4) { v -> -v }
    println(r2)
}

fun transformAndConvert(prefix: String, suffix: String, value: Int, t: (Int) -> Int): String {
    val transformed = t(value)
    return "$prefix$transformed$suffix"
}