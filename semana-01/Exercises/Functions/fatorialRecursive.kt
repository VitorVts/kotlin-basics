//🧠 Exercício 2: Função que calcula o fatorial de um número
//✅ Objetivo:
//
//Criar uma função que calcule o fatorial de um número (n!).
//💪 Desafio:
//
//Refaça essa função de forma recursiva, ou seja, uma função que chama a si mesma.

fun fatorial(n: Int): Int{
    if(n == 0 || n == 1) {
        return 1
    }
    return  n * fatorial(n - 1)
}

fun main() {
    println(fatorial(5))
}
