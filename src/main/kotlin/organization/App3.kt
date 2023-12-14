package organization

typealias ExecutorID = String
typealias CodeToExecute = (ExecutorID) -> String

fun main() {

}

class Executor(val id: ExecutorID) {

    fun execute(code: CodeToExecute): String {
        return code(id)
    }
}
