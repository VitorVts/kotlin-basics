//🧪 Exercício 3 — Calculadora simples
//
//Objetivo: Dado dois números e uma operação (+, -, *, /), retorne o resultado.

fun calculadora(a: Double, b:Double, operacao: Char): Double {

    return when(operacao) {
        '+' ->  a + b
        '-' ->  a - b
        '*' ->  a * b
        '/' ->  a / b
        else -> throw IllegalArgumentException("Operação '$operacao' inválida ")
    }
}

fun main() {
    var result = calculadora(10.0,5.0, '+')
    println(result)
    result = calculadora(8.0,2.0, '/')
    println(result)
    result = calculadora(3.0,3.0,'*')
    println(result)

}