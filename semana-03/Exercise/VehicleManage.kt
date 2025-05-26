interface VehicleOperations {
    fun accelerate()
    fun brake()
    fun displayStatus()
}

inline fun log(action: String,bloco: () -> Unit) {
    println("Iniciando Ação: $action")
    bloco()
    println("Finalizando Ação: $action...\n")
}

data class Driver(val name: String, val cnh: String)

abstract class Vehicle(
    val driver: Driver,
    protected var currentSpeed: Int
) : VehicleOperations {

    override fun displayStatus() {
        log("DisplayStatus") {
        println("Velocidade atual é $currentSpeed km/h")
        }
    }

    override fun accelerate() {
        log("Acelerar") {
            currentSpeed += 10
            println("${driver.name} está acelerando para $currentSpeed km/h")
        }
    }

    abstract override fun brake()
}

class Carro(driver: Driver, currentSpeed: Int) : Vehicle(driver, currentSpeed) {
    override fun brake() {
        log("Frear Carro") {
            currentSpeed -= 10
            println("${driver.name} freia reduzindo para $currentSpeed km/h")
        }
    }
}

class Moto(driver: Driver, currentSpeed: Int) : Vehicle(driver, currentSpeed) {
    override fun brake() {
        log("Frear Moto") {
            currentSpeed -= 5
            println("${driver.name} freia reduzindo para $currentSpeed km/h")
        }
    }
}

fun main() {
    val driver1 = Driver("Vitor", "123456")
    val driver2 = Driver("Yasmin", "753159")

    val carro = Carro(driver1, 0)
    val moto = Moto(driver2, 0)

    carro.accelerate()
    carro.brake()
    carro.displayStatus()

    moto.accelerate()
    moto.brake()
    moto.displayStatus()
}

