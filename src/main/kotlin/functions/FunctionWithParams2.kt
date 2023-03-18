package functions

fun main() {

    sayHello("Pedro", 20)
    sayHello("Maria", 15)
    sayHello("José", 30)
}

private fun sayHello(name: String, temperature: Int) {
    println("Hi, $name! Temperature is $temperature degrees.")
}
