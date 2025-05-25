interface Voador {
    fun Voar()
}

interface Nadador {
    fun nadar()
}

//interfaces permitem heranças múltiplas de diferente das classes , pato consegue implementar as duas sem conflitos
class Pato : Voador, Nadador {
    override fun voar() {
        println("Pato Voando")
    }

    override fun nadar() {
        println("Pato Nadando")
    }
}