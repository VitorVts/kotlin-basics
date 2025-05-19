//🔹 2. Parâmetros Padrão e Nomeados
//
//Objetivo: usar valores padrão e passar argumentos pelo nome.
//🧪 Exercício 3: Função bemVindo que recebe nome e idade, mas idade é opcional (padrão = 0).
//🧪 Exercício 4: Chame bemVindo(nome = "João") usando parâmetro nomeado.

fun bemVindo(nome: String, idade: Int = 0 ) {
    if (idade == 0) {
     return println("Bem vindo $nome")
    }
    return println("Bem vindo $nome vejo que você tem $idade anos")
}

fun main() {
    bemVindo("Vitor")
    bemVindo("Vitor",25)
    bemVindo(nome = "Vitor")
}