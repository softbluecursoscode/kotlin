package functions

import java.lang.StringBuilder

/**
 * EXERCÍCIO
 * ---------
 *
 * Escreva uma função que separa todos os caracteres de uma string com um espaço em branco. Esta função também deve
 * receber um parâmetro opcional indicando se a string deve ser convertida para maiúscula.
 */
fun main() {
    println(spacing("Oi, tudo bem?", true))
}

fun spacing(str: String, isUppercase: Boolean = false): String {
    val sb = StringBuilder()

    for (c in str) {
        sb.append("$c ")
    }

    val r = sb.toString()

    return if (isUppercase) {
        r.uppercase()
    } else {
        r
    }
}