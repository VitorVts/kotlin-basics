abstract class Veiculo(val modelo: String) {
    abstract fun mover()

    fun ligarMotor() {
        println("Ligando o motor do $modelo")
    }
}

class Carro(modelo: String) : Veiculo(modelo) {
    override fun mover() {
        println("$modelo está andando nas rodas")
    }
}

class Barco(modelo: String) : Veiculo(modelo) {
    override fun mover() {
        println("$modelo está navegando")
    }
}

fun main() {
    val carro = Carro("Fusca")
    val barco = Barco("Lancha")

    carro.ligarMotor()
    carro.mover()

    barco.ligarMotor()
    barco.mover()

}