package nullable

/**
 * EXERCÍCIO
 * ---------
 *
 * Escreva um programa que mascara uma senha, substituindo seus caracteres por '*'. Se a senha for nula, a senha
 * '1234' deve ser usada, a qual deve ser mascarada depois.
 */
fun main() {

    val password: String? = null
    val defaultPassword = "1234"

    val mask = "".padEnd((password ?: defaultPassword).length, '*')

    println(password)
    println(mask)
}
