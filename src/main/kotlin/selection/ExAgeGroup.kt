package selection

/**
 * EXERCÍCIO
 * ---------
 *
 * Escreva um programa que, com base em uma idade fornecida, classifica a pessoa nos grupos abaixo:
 *
 * — CRIANÇA: 0 a 12 anos
 * — ADOLESCENTE: 13 a 17 anos
 * — ADULTO: 18 a 65 anos
 * — SÊNIOR: 66 anos ou mais
 */
fun main() {

    println("> ")
    val age = readln().toInt()

    if (age >= 0 && age <= 12) {
        println("CRIANÇA")
    } else if (age >= 13 && age <= 17) {
        println("ADOLESCENTE")
    } else if (age >= 18 && age <= 65) {
        println("ADULTO")
    } else if (age >= 66 && age <= 120) {
        println("SÊNIOR")
    } else {
        println("Idade inválida")
    }
}
