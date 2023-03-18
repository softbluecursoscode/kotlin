package functions

/**
 * EXERCÍCIO
 * ---------
 *
 * Escreva uma função que calcula a idade humana equivalente de um cachorro, considerando que cada ano que
 * um cachorro vive corresponde a 7 anos de vida de um ser humano. O valor da idade deve ser fornecido via teclado.
 */
fun main() {
    println(
        calculateDogAge(
            readln().toDouble()
        ).toInt()
    )
}

private fun calculateDogAge(age: Double): Double {
    return age * 7
}
