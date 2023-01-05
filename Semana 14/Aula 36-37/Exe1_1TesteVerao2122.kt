
////
// Given
fun readInt(q: String): Int? {
    print("$q? ")
    return readln().toIntOrNull()
}

data class Bet(val key: List<Int>, val stars: List<Int>) // Apostas ou Chaves

fun Bet.show(name: String) = println("$name: $key + $stars")

data class Prize(val num: Int, val equalsKeys: Int, val equalsStars: Int) // Prémios

val prizes = listOf( Prize(1,5,2), Prize(2,5,1), Prize(3,5,0), Prize(4,4,2), Prize(5,4,1),
    Prize(6,3,2), Prize(7,4,0), Prize(8,2,2), Prize(9,3,1), Prize(10,3,0),
    Prize(11,1,2), Prize(12,2,1), Prize(13,2,0) )

fun numberOfEquals(first: List<Int>, second: List<Int>): Int = first.count { it in second }
////

// 1.
fun readValidNumber(quest: String, max: Int, exclude: List<Int>): Int {
    var n: Int?
    do {
        n = readInt("$quest (1..$max))")
    }
    while (n == null || n !in 1..max || n in exclude) // Smart cast is in 2nd and 3rd conditions of OR
    return n // Smart cast is done here
}

// 2.
fun readValidNumbers(name: String, size: Int, max: Int): List<Int> {
    var list = emptyList<Int>()
    var order = 1
    while (list.size < size) {
        val n = readValidNumber("$order. $name", max, list)
        list += n // Here n is not repeated in (because readValidNumber checks it) list, so add it
        ++order
    }
    return list
}

// 3.
fun generateRandomNumbers(size: Int, max: Int): List<Int> {
    var list = emptyList<Int>()
    while (list.size < size) {
        val rnd = (1..max).random() // Generate a random number
        if (rnd !in list)
            list += rnd
    }
    return list
}

// 4.
fun getBet(random: Boolean): Bet {
    return if (random)
        Bet(key = generateRandomNumbers(5, 50), stars = generateRandomNumbers(2, 12))
    else
        Bet(key = readValidNumbers("Numero", 5, 50), stars = readValidNumbers("Estrela", 2, 12))
}

// 5.
fun Bet.getPrize(winning: Bet): Prize? {
    // Get number of equal numbers and stars of Bet this comparing with the winning Bet
    val equalsKeys = numberOfEquals(winning.key, this.key)
    val equalsStars = numberOfEquals(winning.stars, this.stars)
    for (p in prizes) {
        if (p.equalsKeys == equalsKeys && p.equalsStars == equalsStars)
            return p
    }
    return null // No prize was found
}


// 6.
// Implemente a função main com o seguintes objetivos: 1o Perguntar ao utilizador quantas apostas (simples) quer
// fazer (valor entre 1 e 5); 2o Lê e guarda cada aposta podendo, em cada uma, o utilizador escolher entre introduzir os
// números e as estrelas ou ser gerada uma aposta aleatória (realizando previamente a pergunta "aposta aleatória
// (S/N)?"); 3o Gera uma chave vencedora aleatória e apresenta-a chamando a função show; 4o Apresenta cada uma
// das apostas realizadas, chamando a função show, e apresenta o respetivo prémio associado, caso exista.
fun main() {
    // 1.
    val numOfBets = readValidNumber("Quantas apostas (simples) quer fazer (valor entre 1 e 5)", 5, emptyList<Int>())
    var bets = emptyList<Bet>()
    // 2. Lê e guarda cada aposta podendo, em cada uma, o utilizador escolher entre introduzir os
    // números e as estrelas ou ser gerada uma aposta aleatória (realizando previamente a pergunta "aposta aleatória
    // (S/N)?");
    for (i in 1..numOfBets) {
        println("Aposta aleatória (S/N)?")
        val option: Char = readln()[0]
        bets += getBet(option == 'S')
    }

    // 3. Gera uma chave vencedora aleatória e apresenta-a chamando a função show;
    val winning = getBet(true)
    winning.show("chave vencedora aleatória")

    // 4. Apresenta cada uma das apostas realizadas, chamando a função show, e apresenta o respetivo prémio associado, caso exista.
    for (i in 1..numOfBets) {
        bets[i-1].show("Aposta $i")
        val prize: Prize? = bets[i-1].getPrize(winning) // Could be null
        if (prize != null)
            println("Ganhou premio n. ${prize.num}")
    }
}
/*
OUTPUT:
Quantas apostas (simples) quer fazer (valor entre 1 e 5) (1..5))? 6
Quantas apostas (simples) quer fazer (valor entre 1 e 5) (1..5))? 5
Aposta aleatória (S/N)?
S
Aposta aleatória (S/N)?
N
1. Numero (1..50))? 12
2. Numero (1..50))? 13
3. Numero (1..50))? 55
3. Numero (1..50))? 43
4. Numero (1..50))? 21
5. Numero (1..50))? 222
5. Numero (1..50))? 22
1. Estrela (1..12))? 3
2. Estrela (1..12))? 3
2. Estrela (1..12))? 4
Aposta aleatória (S/N)?
S
Aposta aleatória (S/N)?
S
Aposta aleatória (S/N)?
S
chave vencedora aleatória: [30, 21, 2, 26, 6] + [4, 2]
Aposta 1: [17, 37, 32, 9, 21] + [10, 2]
Aposta 2: [12, 13, 43, 21, 22] + [3, 4]
Aposta 3: [23, 27, 48, 21, 6] + [10, 12]
Ganhou premio n. 13
Aposta 4: [1, 45, 7, 14, 30] + [1, 9]
Aposta 5: [14, 28, 36, 12, 18] + [8, 7]
 */


















