//🔹 5. Funções com Lambda (como parâmetro)
//
//Objetivo: passar funções como parâmetro.
//🧪 Exercício 9: Crie a função aplicarOperacao(x: Int, operacao: (Int) -> Int) que aplica a operação ao número.
//🧪 Exercício 10: Use a função anterior com dobro, triplo e quadrado como lambdas.

fun aplicarOperacao(x: Int, operacao:(Int)->Int): Int {
    return operacao(x)
}

fun dobrar(x: Int): Int {
    return x*2
}

fun triplo(x: Int): Int {
    return x*3
}

fun aoQuadrado(x: Int): Int {
    return x * x
}


fun main() {

    println(aplicarOperacao(2, ::dobrar))
    println(aplicarOperacao(2, ::triplo))
    println(aplicarOperacao(2, ::aoQuadrado))

}
