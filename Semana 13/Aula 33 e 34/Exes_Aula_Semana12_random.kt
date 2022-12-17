/*
Aleatoriedade
Escolha aleatória em intervalos e listas
Criação de listas com base em intervalos
Geração aleatória sem repetições
Função distinct;
 */

fun main() {
    val range = 1..10
    val range1: IntRange = 1..100

    // Generate random values from range and list
    println("Random value from first range: ${range.random()}")
    println("Random value from second range: ${range1.random()}")
    // Convert range to list
    val list: List<Int> = range.toList()
    // Lists also have random function
    println("Random value from list: ${list.random()}")

    println("5 random values from list without repetitions:")
    var randomValues = genWithoutRepetitions1(list, 5)
    println(randomValues)
    randomValues = genWithoutRepetitions2(list, 5)
    println(randomValues)

    // Distinct function
    println(listOf<Int>(3, 3, 1, 1, 1, 4, 2, 2, 1, 1).myDistinct1())
    println(listOf<Int>(3, 3, 1, 1, 1, 4, 2, 2, 1, 1).myDistinct2())
}

fun List<Int>.myDistinct1(): List<Int> {
    var nonRepeated: List<Int> = emptyList()
    for (elem in this) {
        if (!contains(nonRepeated, elem))
            nonRepeated += elem
    }
    return nonRepeated
}

// Another implementation
fun List<Int>.myDistinct2(): List<Int> {
    var nonRepeated: List<Int> = emptyList()
    var found: Boolean
    for (i in 0..this.size-1) {
        // Search backwards in the left window of the list indices
        found = false
        for (j in i-1 downTo 0) {
            if (this[j] == this[i]) {
                found = true
                break
            }
        }
        if (!found)
            nonRepeated += this[i]
    }
    return nonRepeated
}

fun genWithoutRepetitions1(list: List<Int>, n: Int): List<Int> {
    var nonRepeated: List<Int> = emptyList()
    do {
        val rand = list.random()
        if (rand !in nonRepeated)
            nonRepeated += rand
    }
    while (nonRepeated.size < n)
    return nonRepeated
}


fun genWithoutRepetitions2(list: List<Int>, n: Int): List<Int> {
    var nonRepeated: List<Int> = emptyList()
    do {
        val rand = list.random()
        if (!contains(nonRepeated, rand))
            nonRepeated += rand
    }
    while (nonRepeated.size < n)
    return nonRepeated
}

fun contains(list: List<Int>, elem: Int): Boolean {
    for (i in 0..list.size - 1) {
        if (list[i] == elem)
            return true
    }
    return false
}



























