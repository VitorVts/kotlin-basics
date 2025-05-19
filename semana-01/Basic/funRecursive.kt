//🔹 4. Funções Recursivas
//
//Objetivo: entender e aplicar recursão com caso base.
//🧪 Exercício 7: Crie a função contarRegressivo(n: Int) que imprime os números de n até 0 recursivamente.
//🧪 Exercício 8: Implemente fatorial(n: Int) de forma recursiva.

fun contarRegressivo(n: Int) {

    if(n==0)
    {
        println("Acabou!")
        return
    }
    println(n)
    return contarRegressivo(n-1)

}



fun fatorial(n: Int): Int {
    if(n == 0 || n == 1) {
        return 1
    }
    return  n * fatorial(n - 1)
}

fun main() {
    contarRegressivo(10)
    println(fatorial(5))
}