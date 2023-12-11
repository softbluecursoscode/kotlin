package lambda

/**
 * EXERCÍCIO
 * ---------
 *
 * Crie uma função chamada runIfTrue() que recebe um valor booleano e um código a ser executado caso o booleano
 * seja verdadeiro (se ele for falso o código não será executado).
 *
 * A função runIfTrue() deve retornar o valor retornado pelo código executado, ou null caso o código não tenha sido
 * executado.
 */
fun main() {
    val x = 5

    val r = runIfTrue(x > 5) {
        println("Code executed")
        x
    }
    println(r)
}

fun runIfTrue(condition: Boolean, code: () -> Any?): Any? {
    return if (condition) {
        code()
    } else {
        null
    }
}