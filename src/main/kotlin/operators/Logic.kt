package operators

fun main() {
    // Tabela-Verdade

    // AND
    println("T AND T ${true && true}")
    println("T AND F ${true && false}")
    println("F AND T ${false && true}")
    println("F AND F ${false && false}")

    println()

    // OR
    println("T OR T ${true || true}")
    println("T OR F ${true || false}")
    println("F OR T ${false || true}")
    println("F OR F ${false || false}")

    println()

    // NOT
    println("NOT F ${!false}")
    println("NOT T ${!true}")
}
