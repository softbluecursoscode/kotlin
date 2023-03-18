package repetition

/**
 * EXERCÍCIO
 * ---------
 *
 * Imprima na tela a tabuada de um número de 1 a 10. O número deve ser fornecido pelo usuário.
 * Utilize a estrutura de repetição for para resolver o exercício.
 */
fun main() {

    print("> ")
    val n = readln().toInt()
    val m = 10

    for (x in 1..m) {
        println("$n x $x = ${n * x}")
    }
}
