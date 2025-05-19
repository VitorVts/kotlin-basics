//🔹 6. Funções Anônimas / Lambdas
//
//Objetivo: declarar e usar funções anônimas (val com {}).
//🧪 Exercício 11: Declare uma lambda val quadrado = { x: Int -> x * x } e teste com vários valores.
//🧪 Exercício 12: Use map com uma lista de inteiros para aplicar quadrado em todos os elementos.

fun main() {
    val quadrado = { x: Int -> x * x }
    println(quadrado(2))
    println(quadrado(4))
    println(quadrado(5))

    val numeros = listOf(1,2,3,4,5)
    val numerosMultiplicados = numeros.map{quadrado(it)}
    println(numerosMultiplicados)
}