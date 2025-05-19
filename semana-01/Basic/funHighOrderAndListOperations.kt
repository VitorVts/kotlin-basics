//🔹 7. Funções de Alta Ordem + Operações com Listas
//
//Objetivo: usar filter, map, reduce, etc.
//🧪 Exercício 13: Com filter, crie uma função que retorna apenas os números pares de uma lista.
//🧪 Exercício 14: Use reduce para somar os elementos de uma lista sem usar .sum().


fun main(){
    val numeros = listOf(1,2,3,4,5,6)
    val numerospares = numeros.filter {it % 2 == 0}
    val numerosimpares = numeros.filterNot {it % 2 == 0}
    println(numerospares)
    println(numerosimpares)

    val soma = numeros.reduce { acumulador, numero -> acumulador + numero}
    println(soma)
}