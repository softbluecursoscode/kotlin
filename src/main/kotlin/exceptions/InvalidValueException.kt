package exceptions

import java.lang.RuntimeException

class InvalidValueException(val value: Double) : RuntimeException("Value $value is not valid")
