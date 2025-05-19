//🧠 Exercício 3: Função que formata um nome completo
//✅ Objetivo:
//
//Criar uma função que recebe nome, sobrenome e um parâmetro opcional capitalizado (Boolean), e retorna o nome completo com ou sem capitalização.

fun formatarNome(uppercase: Boolean = false, vararg names: String): String {
    val nomeCompleto = names.joinToString(" ")
    return if (uppercase) nomeCompleto.uppercase() else nomeCompleto
}

fun main() {
    println(formatarNome(names = *arrayOf("Vitor", "Gomes")))
    println(formatarNome(true, "Vitor", "Gomes"))
}
