//Crie uma função que receba uma List<Int> e retorne:
//
//1.A soma total dos números
//
//2.O menor número
//
//3.O maior número

fun main() {

    fun analisarLista(numeros: List<Int>) {
        val soma = numeros.sum()
        val menor = numeros.minOrNull()
        val maior = numeros.maxOrNull()

        println("Soma: $soma")
        println("Menor: $menor")
        println("Maior: $maior")
    }

    val lista = listOf(10,5,3,8,5)
    analisarLista(lista)

}