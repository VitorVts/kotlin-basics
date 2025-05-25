import java.text.Normalizer

// 🔤 Extensão para String: remove acentos
fun String.removeAccents(): String {
    return Normalizer.normalize(this, Normalizer.Form.NFD)
        .replace(Regex("\\p{Mn}+"), "") // Remove caracteres acentuados
}

// 🔢 Extensão para Int: verifica se é par
fun Int.isEven(): Boolean {
    return this % 2 == 0
}

// 📊 Extensão para List<Int>: calcula média
fun List<Int>.media(): Double {
    if (this.isEmpty()) return 0.0
    return this.sum().toDouble() / this.size
}

fun main() {
    // Teste da String.removeAccents()
    val frase = "Olá, você está bem?"
    println(frase.removeAccents()) // Saída: Ola, voce esta bem?

    // Teste do Int.isEven()
    val numero = 7
    println("$numero é par? ${numero.isEven()}") // 7 é par? false

    // Teste do List<Int>.media()
    val notas = listOf(7, 8, 9)
    println("Média das notas: ${notas.media()}") // Média das notas: 8.0
}
