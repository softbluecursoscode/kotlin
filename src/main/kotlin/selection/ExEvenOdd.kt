package selection

/**
 * EXERCÍCIO
 * ---------
 *
 * Escreva um programa que recebe um valor fornecido pelo teclado e diz se ele é par ou ímpar.
 */

fun main() {

    print("> ")
    val x = readln().toInt()

    val type: String
    if (x % 2 == 0) {
        type = "PAR"
    } else {
        type = "ÍMPAR"
    }

    println(type)
}