package polimorphism

interface A {
    fun a()

    fun a2() {
        println()
    }
}

interface B : A {
    fun b()
}

interface C {
    fun c()
}

class Impl : B, C {
    override fun b() {
        TODO("Not yet implemented")
    }

    override fun a() {
        TODO("Not yet implemented")
    }

    override fun c() {
        TODO("Not yet implemented")
    }
}