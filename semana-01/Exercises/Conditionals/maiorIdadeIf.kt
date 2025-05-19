//🧪 Exercício 1 — Verifica maioridade
//
//Objetivo: Ler a idade de uma pessoa e dizer se ela é maior de idade (18+).

fun verificaMaiorIdade(idade: Int): String {

    if(idade < 18) return "Menor de Idade"
    return "Maior idade"
}

fun main() {
   val resultado = verificaMaiorIdade(17)
    println(resultado)
}