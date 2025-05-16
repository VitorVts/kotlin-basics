//Define a map that relates integer numbers from 1 to 3 to their corresponding spelling. Use this map to spell the given number.

fun main() {
    val number2word = mapOf(1 to "one", 2 to "two", 3 to "three")
        val n = 2
    println("$n is spelt as '${number2word[n]}'")
}