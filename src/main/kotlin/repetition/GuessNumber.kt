package repetition

import kotlin.random.Random

/**
 * EXERCÍCIO
 * ---------
 *
 * Crie um jogo de adivinhação numérica. O computador deve sortear um número aleatório dentro de um intervalo e você
 * deve tentar descobri-lo. A cada tentativa, o programa diz se o número é maior ou menor do que o número tentado.
 * O jogo acaba quando o número tentado for o número correto.
 */
fun main() {

    val secret = Random.nextInt(0, 101)

    while (true) {
        print("> ")
        val n = readln().toInt()

        when {
            n > secret -> println("O número sorteado é menor")
            n < secret -> println("O número sorteado é maior")
            else -> {
                println("PARABÉNS! Você acertou o número, que era $n")
                break
            }
        }
    }
}
