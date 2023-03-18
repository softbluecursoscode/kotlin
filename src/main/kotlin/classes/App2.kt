package classes

fun main() {

    val a1 = Account()
    val a2 = Account()

    a1.deposit(2000.0)
    a2.deposit(150.0)

    println(a1.balance)
    println(a2.balance)
}
