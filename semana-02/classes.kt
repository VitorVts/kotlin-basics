class Pessoa(val nome: String, var idade: Int, val altura: Double) {
    init {
        println("Pessoa criada: $nome,$idade anos, $altura de altura")
    }

    fun apresentar() {
        println("Oi, meu nome é $nome e tenho $idade anos e %.2f m de altura".format(altura))
    }

    fun fazerAniversario(){
        idade++
        println("O $nome fez aniversário e agora está com $idade anos.")
    }
}

fun main() {
    val pessoa1 = Pessoa("Vitor", 25, 1.70)
    val pessoa2 = Pessoa("Ana",32, 1.58)

    pessoa1.apresentar()
    pessoa2.apresentar()

    pessoa1.fazerAniversario()

    val listPessoas = mutableListOf(pessoa1,pessoa2)

  listPessoas.forEach{it.apresentar()}
}