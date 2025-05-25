interface Atacante {
    fun atacar()
}

interface Defensor {
    fun defender()
}

class Guerreiro : Atacante, Defensor {
    override fun atacar() {
        println("Guerreiro deu uma machadada!")
    }

    override fun defender() {
        println("Guerreiro Se defendeu do ataque!")
    }
}

class Mago : Atacante, Defensor {
    override fun atacar() {
        println("Mago usa seu cajado para lancar uma raja de mana ! ")
    }
    override fun defender() {
        println("Mago Cria uma barreira mágica para defender a si e a todos ! ")
    }
}

fun main() {
    val guerreiro = Guerreiro
    val mago = Mago

    guerreiro.atacar()
    guerreiro.defender()

    mago.atacar()
    mago.defender()
}