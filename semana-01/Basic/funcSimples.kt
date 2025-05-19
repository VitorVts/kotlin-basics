//🔹 1. Funções Simples
//
//Objetivo: entender a sintaxe básica de funções, parâmetros e retorno.
//🧪 Exercício 1: Crie uma função dobro que recebe um número e retorna o dobro.
//🧪 Exercício 2: Crie uma função cumprimentar que recebe um nome e imprime "Olá, {nome}".

fun dobro(n: Int): Int {
    return n*2
}

fun cumprimentar(nome:String): String {
    return "Olá $nome"
}

fun main() {
    println(dobro(2))
    println(cumprimentar("Vitor"))
}