package exceptions

fun main() {
    val account = BankAccount()

    try {
        account.deposit(500.0)
        account.withdraw(600.0)
    } catch (e: InvalidValueException) {
        println("Ops, invalid deposit: ${e.message}")
    } catch (e: InsufficientFundsExceptions) {
        println("Error! Current balance is ${e.currentBalance}")
    } finally {
        println(account.balance)
    }
}

class BankAccount {
    var balance: Double = 0.0
        private set

    fun deposit(value: Double) {
        if (value < 0) {
            throw InvalidValueException(value)
        }
        balance += value
    }

    fun withdraw(value: Double) {
        if (value < 0) {
            throw InvalidValueException(value)
        }

        if (balance - value < 0) {
            throw InsufficientFundsExceptions(balance)
        }

        balance -= value
    }
}