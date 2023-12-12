package collectionlambda

data class Person(val name: String, val age: Int) {

    companion object {
        fun data(): List<Person> {
            return listOf(
                Person("Pedro", 25),
                Person("Manoel", 30),
                Person("Gustavo", 10),
                Person("Maria", 32),
                Person("Ricardo", 53),
                Person("Joana", 49),
                Person("Arlindo", 44),
                Person("Roberto", 19)
            )
        }
    }
}