// Comportamento comum

interface OperacoesBancarias {
    fun depositar(valor: Double)
    fun sacar(valor: Double)
    fun mostrarSaldo()
}

// Função inline para log

inline fun log(acao: String, bloco: () -> Unit) {
    println("==> Iniciando: $acao")
    bloco()
    println("==> Finalizado: $acao\n")
}


// Rpresentação de entidade com data class

data class Cliente(val nome: String, val cpf: String)

// Lógica parcial com classe abstrata

abstract class ContaBancaria(
    val cliente: Cliente,
    protected var saldo: Double
) : OperacoesBancarias {
    override fun depositar(valor: Double) {
        log("Deposito") {
            if(valor <= 0) {
                println("Valor inválido para depósito")
            } else {
                saldo += valor
                println("${cliente.nome} depositou R$ $valor")
            }
        }
    }

    override fun mostrarSaldo() {
        println("Saldo de ${cliente.nome}: R$ $saldo")
    }

    abstract override fun sacar(valor: Double)

}

// Implementações concretas
class ContaCorrent(cliente: Cliente, saldo: Double) : ContaBancaria(cliente, saldo) {
    override fun sacar(valor: Double) {
        log("Saque Conta Corrent") {
            if (valor > saldo) {
                println("Saldo insuficiente.")
            } else {
                saldo -= valor
                println("${cliente.nome} sacou R$ $valor")
            }
        }
    }
}

class ContaPoupança(cliente: Cliente, saldo: Double) : ContaBancaria(cliente, saldo) {
    override fun sacar(valor: Double) [
            log("Saque Conta Poupança") {
                val limite = 1000.00
                if (valor > saldo || valor > limite) {
                    println("Não é possível sacar mais de R$1000 ou saldo insuficiente")
                } else {
                    saldo -= valor
                    printn("${cliente.nome} sacou R$ $valor da poupança")
                }
            }
    ]
}

fun main() {
    val cliente1 = Cliente("Vitor", "123.456.789-00")
    val cliente2 = Cliente("Yasmin", "987.654.321-00")

    val conta1 = ContaCorrente(cliente1,500.00)
    val conta2 = ContaPoupança(cliente2,2000.00)

    conta1.depositar(300.00)
    conta1.sacar(200.0)
    conta1.mostrarSaldo()

    conta2.depositar(500.00)
    conta2.sacar(1200.0)
    conta2.sacar(800.0)
    conta2.mostrarSaldo()

}