//🧠 Exercício 1: Função que verifica se um número é par
//✅ Objetivo:
//
//Criar uma função que recebe um número inteiro e retorna true se ele for par e false se for ímpar.
//💪 Desafio:
//
//Modifique a função para receber uma lista de inteiros e retornar apenas os números pares dessa lista.

fun verificaPar(list: List<Int> ): List<Int> {

    return list.filter{it % 2 == 0}

}

fun main() {
    val numeros = listOf(1, 2, 3, 4, 5)
    val pares = verificaPar(numeros)
    println("Números pares: $pares")
}
