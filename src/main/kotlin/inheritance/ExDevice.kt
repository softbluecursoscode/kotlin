package inheritance

/**
 * EXERCÍCIO
 * ---------
 *
 * Crie uma classe Device que representa um dispositivo que pode estar ligado ou desligado. Crie métodos para ligar
 * e desligar o dispositivo.
 *
 * Depois, crie as classes TV e Telephone, subclasses de Device, e faça com que o comportamento de ligar e desligar
 * funcione para estas subclasses.
 */
fun main() {

    val d1 = TV()
    d1.on()
    println(d1.isOn)

    val d2 = Telephone()
    d2.on()
    println(d2.isOn)
}

abstract class Device {
    var isOn = false
        private set

    fun on() {
        isOn = true
    }

    fun off() {
        isOn = false
    }
}

class TV : Device()

class Telephone: Device()