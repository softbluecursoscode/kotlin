package nullable

/**
 * EXERCÍCIO
 * ---------
 *
 * Escreva um programa que solicita um número a um usuário, multiplica ele por 2 duas vez e subtrai 10. Se o usuário
 * digitar algo que não possa ser convertido em um número, o número 2 deve ser assumido como padrão.
 * O programa deve calcular o valor do número e mostrá-lo na tela em uma única expressão.
 */
fun main() {
    println(
        (readln().toIntOrNull() ?: 2)
            .times(2)
            .times(2)
            .minus(10)
    )
}
