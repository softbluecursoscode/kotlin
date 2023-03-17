package selection

/**
 * EXERCÍCIO
 * ---------
 *
 * Escreva um programa que recebe um valor numérico pelo teclado, multiplica por ele mesmo e imprime o resultado.
 * Entretanto, se o valor fornecido for maior que 10, ele deve ser ajustado para 10 antes de ser multiplicado.
 */

fun main() {

    print("> ")
    var v = readln().toInt()

    if (v > 10) {
        v = 10
    }

    //v = v * v
    v *= v
    println(v)
}