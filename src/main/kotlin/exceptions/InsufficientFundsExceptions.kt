package exceptions

import java.lang.RuntimeException

class InsufficientFundsExceptions(val currentBalance: Double) : RuntimeException()
