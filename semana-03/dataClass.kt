data class Produto(val nome: String, val preco: Double)

fun main() {
    val p1 = Produto("Notebook", 3500.0)
    val p2 = p1.copy(preco = 3200.0)

    println(p1)                    // toString()
    println(p2)

    println(p1 == p2)             // equals()
    println(p1.hashCode())        // hashCode()
    println(p2.hashCode())
}
