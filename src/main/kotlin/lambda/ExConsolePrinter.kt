package lambda

/**
 * EXERCÍCIO
 * ---------
 *
 * Implemente uma função que imprime informações na tela entre duas linhas que contêm asteriscos (**********). O
 * conteúdo impresso deve ser computado por uma expressão lambda.
 */
fun main() {
    console { "Hey" }

    val x = 10

    console {
        val y = (x * 2) * -1
        y + 1
    }
}

fun console(producer: () -> Any) {
    println("**********")
    println(producer)
    println("**********")
}
