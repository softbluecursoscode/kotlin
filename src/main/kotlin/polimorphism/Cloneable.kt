package polimorphism

fun main() {
    val tree = Tree("Brown", 1.56)
    val treeCopy = tree.clone()

    println(tree)
    println(treeCopy)
}

interface Cloneable {

    fun clone(): Any
}

data class Tree(
    val color: String,
    val height: Double
) : Cloneable {

    override fun clone(): Any {
        return Tree(color, height)
    }
}