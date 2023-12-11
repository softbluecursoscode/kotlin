package exceptions

fun main() {

    val bankAccount = BankAccount()
    try {
        bankAccount.deposit(300.0)
        bankAccount.withdraw(500.0)
    } catch (_: Exception) {}

    println(bankAccount.balance)
}