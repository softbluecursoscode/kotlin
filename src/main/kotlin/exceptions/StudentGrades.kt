package exceptions

fun main() {
    try {
        val avg = StudentGrades()
            .add(-3.0)
            .add(5.5)
            .add(12.0)
            .average()

        println(avg)
    } catch (e: Exception) {
        println("Error: ${e.message}")
        e.printStackTrace()
    }
}

class StudentGrades {
    private var sum: Double = 0.0
    private var numberOfGrades: Int = 0

    fun add(grade: Double): StudentGrades {
//        if (grade !in 0.0..10.0) {
//            throw IllegalArgumentException("Invalid grade")
//        }

        require(grade in 0.0..10.0) { "Grade $grade is not valid" }

        sum += grade
        numberOfGrades++
        return this
    }

    fun average(): Double {
        return sum / numberOfGrades
    }
}