package variables

/**
 * EXERCÍCIO
 * ---------
 *
 * Solicite 3 informações ao usuário: nome, idade e peso. Depois imprima uma frase que contenha essas
 * informações (use string templates para montar a frase).
 */
fun main() {

    print("Nome: ")
    val name = readln()

    print("Idade: ")
    val age = readln().toInt()

    print("Peso: ")
    val weight = readln().toDouble()

    println("O seu nome é $name. Você tem $age anos e o seu peso é $weight.")
}
