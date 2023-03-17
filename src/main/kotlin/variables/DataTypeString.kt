package variables

fun main() {

    val s1 = "abc"
    val s2 = "def"

    //val s1s2 = "Soma: " + (s1 + s2)
    val s1s2 = "Soma: '$s1$s2'. O tamanho é: ${(s1 + s2).length}"

    println(s1s2)
}
