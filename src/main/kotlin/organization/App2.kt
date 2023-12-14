package organization

import organization.p1.Counter
import organization.p2.Counter as CounterDecrement

fun main() {

    val c1 = Counter()
    c1.increment()

    val c2 = CounterDecrement()
    c2.decrement()
}
