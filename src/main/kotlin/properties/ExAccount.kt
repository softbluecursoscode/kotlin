package properties

/**
 * EXERCÍCIO
 * ---------
 *
 * Crie uma classe Account para representar uma conta bancária. Esta classe deve ter uma propriedade balance para
 * armazenar o saldo da conta. Quando uma conta é criada, ela pode opcionalmente conter um saldo inicial, o
 * qual não pode ser inferior a 0. Além disso, o saldo só pode ser alterado através do método deposit() e
 * withdraw(), responsáveis pelos depósitos e saques na conta, respectivamente.
 */
fun main() {

    val account = Account(100.0)

    account.deposit(1000.0)
    account.withdraw(100.0)
    account.withdraw(500.0)

    println(account.balance)
}

class Account(balance: Double = 0.0) {

    init {
        require(balance >= 0)
    }

    var balance: Double = balance
        private set

    fun deposit(amount: Double) {
        require(amount >= 0)
        balance += amount
    }

    fun withdraw(amount: Double) {
        require(amount >= 0)
        balance -= amount
    }
}
