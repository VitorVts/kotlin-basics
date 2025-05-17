
//🧠 Exercício 2 – Trabalhando com Set
//
//Agora transforme a lista acima em um Set e:
//
//1.Tente adicionar nomes duplicados
//
//2.Veja o que acontece

fun main () {
    val nomesUnicos = mutableSetOf("Yasmin", "Vitor", "Mariana")

    nomesUnicos.add("Maria")
    nomesUnicos.add("Anna")

    println("Set Final: $nomesUnicos")
}