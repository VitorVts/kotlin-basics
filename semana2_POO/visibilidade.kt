// Pode ser herdada por outras classes
open class ContaBancaria(
    private val numero: String,         // Só visível dentro desta classe
    protected var saldo: Double         // Visível em subclasses
) {
    fun mostrarSaldo() {
        println("Saldo: R$ $saldo")
    }

    private fun logAcesso() {           // Só pode ser usada dentro da própria classe
        println("Acesso registrado para conta $numero")
    }

    internal fun operacaoInterna() {    // Pode ser usada dentro do mesmo projeto
        println("Operação visível dentro do mesmo módulo")
    }

    fun acessar() {
        logAcesso() // Aqui a função privada é chamada normalmente (está na mesma classe)
    }
}

class ContaCorrente(numero: String, saldo: Double) : ContaBancaria(numero, saldo) {
    
    fun sacar(valor: Double) {
        if (valor <= saldo) {
            saldo -= valor // saldo é protected, então posso usar
            println("Saque de R$ $valor realizado")
        } else {
            println("Saldo insuficiente")
        }
    }
}

fun main() {
    val conta = ContaCorrente("123456", 1000.0)
    conta.mostrarSaldo()
    conta.sacar(200.0)
    conta.mostrarSaldo()

    // conta.numero // ❌ ERRO: número é private
    // conta.saldo // ❌ ERRO: saldo é protected
    conta.operacaoInterna() // ✅ OK: internal funciona no mesmo módulo
    conta.acessar()         // ✅ OK: método público que acessa um método privado
}
