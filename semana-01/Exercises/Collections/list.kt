// 🧠 Exercício 1 – Trabalhando com List

// Crie uma List de nomes e:

//   1.Imprima o primeiro nome

//   2.Adicione um nome

//   3.Remova um nome

//   4. Verifique se um nome existe

fun main () {
    val nomes = mutableListOf("Yasmin", "Vitor", "Mariana")

    println("Primeiro nome: ${nomes[0]}")

    nomes.add("Maria")
    println("Após adicionar: $nomes")

    nomes.remove("Vitor")
    println("Após remover: $nomes")

    println("Existe Calors ${"Yasmin" in nomes}")
}