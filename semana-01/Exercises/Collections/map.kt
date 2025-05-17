🧠 Exercício 3 – Trabalhando com Map

//Use um Map para armazenar idades das pessoas:
//
//1.Adicione nomes como chave e idade como valor
//
//2.Altere a idade de uma pessoa
//
//3.Verifique se uma chave existe
//
//4.Liste todas as chaves e valores

fun main() {
    val idades = mutableMapOf(
        "Vitor" to 25,
        "João" to 30
    )

    idades["Carlos"] = 28
    idades["Maria"] = 31

    println("Idade do Carlos: ${idades["Carlos"]}")
    println("Existe Maria? ${"Maria" in idades}")

    println("Pessoas: ${idades.keys}")
    println("Idades: ${idades.values}")
}