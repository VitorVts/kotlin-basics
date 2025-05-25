
// abstract class não poe ser instanciada diretamente
abstract class Animal(val nome: String) {
    abstract fun emitirSom()

    fun dormir() {
        println("$nome está dormindo.")
    }
}

//Cachorro é a subclasse que implementa o método
class Cachorro(nome: String): Animal(nome) {
    //é um método abstrado ->obrigátorio sobrescrever usando o override
    override fun emitirSom() {
        println("$nome: Au Au!")
    }
}

fun main() {
    val dog = Cachorro("Rex")
    dog.emitirSom()
    dog.dormir()
}