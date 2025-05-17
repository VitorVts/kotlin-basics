//🧪 Exercício 2 – Verificar Duplicatas com Set
//
//Dada uma lista de nomes, escreva uma função que:
//
//Verifique se há nomes repetidos.
//
//Retorne uma nova lista com os nomes únicos, na mesma ordem de entrada.
//
//Dica: use um Set internamente para ajudar a detectar duplicatas.

fun removerDuplicatas(lista: List<String>): List<String> {
    val nomesUnicos = mutableListOf<String>()
    val nomesJaVistos = mutableSetOf<String>()

    for (nome in lista) {
        if (nome !in nomesJaVistos) {
            nomesUnicos.add(nome)
            nomesJaVistos.add(nome)
        }
    }

    return nomesUnicos
}

fun main() {
    val nomes = listOf("Ana", "Carlos", "Ana", "Vitor", "Carlos", "Yasmin")
    val nomesSemDuplicatas = removerDuplicatas(nomes)
    println("Nomes sem duplicatas: $nomesSemDuplicatas")
}
