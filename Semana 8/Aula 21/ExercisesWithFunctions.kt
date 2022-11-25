/*
fun readTwoChars(question: String): List<Char> - Apresenta pergunta question e lê 2 caracteres, colocando-os numa lista que é depois retornada
fun readTwoNumbers(question: String): List<Int> - Apresenta pergunta question e lê 2 inteiros, colocando-os numa lista que é depois retornada
fun readNumbers(question: String): List<Int> - Apresenta pergunta question e lê vários números numa linha até ser introduzido ENTER. Os números são colocados numa lista que é depois retornada. Deve usar a função de extensão String.split;
fun printChars(list: List<Char>) - Imprime lista de caracteres, um por linha
fun List<Char>.printChars() - função de extensão que imprime lista de caracteres, um por linha
fun String.split(delimiters: String): List<String> - função de extensão de String que separa a String this pelos separadores (um ou mais caracteres) colocando as palavras individuais (tokens) numa lista que é depois devolvida;
 */


fun readTwoChars(question: String): List<Char> {
    println(question)
    val line = readln()
    return listOf<Char>(line[0], line[2]) // We assume that two chars are entered, separated by space
}


fun readTwoNumbers(question: String): List<Int> {
    println(question)
    val val1 = readln().toInt()
    val val2 = readln().toInt()
    return listOf<Int>(val1, val2) // We assume that two numbers are entered, one per line
}


fun readNumbers(question: String): List<Int> {
    println(question)
    val words: List<String> = readln().split(' ')
    val newList: List<Int> = words.map {
        it.toInt()
    }
    return newList
}


fun printChars(list: List<Char>) {
//    list.forEach {
//        println(it)
//    }
//    // Or:
//    for (ch in list)
//        println(ch)
//    // Or:
//    for (idx in list.indices)
//        println(list[idx])
//    // Or:
//    for (idx in 0..list.size-1)
//        println(list[idx])
    // Or:
    var idx = 0
    while (idx < list.size) {
        println(list[idx])
        ++idx
    }
}


fun List<Char>.printChars1() {
    for (ch in this) // The list of chars is represented by the *this* variable
        println(ch)
}


// Only one delimiter
fun String.splitSimple(delimiter: Char): List<String> {
    var word = ""
    var words = listOf<String>()
    for (ch in this) {
        if (ch != delimiter)
            word += ch // Compose word
        else {
            // Add word to words list
            words += word
            // Reset word
            word = ""
        }
    }
    // Add last word
    words += word

    return words
}


// Several delimiters
fun String.split1(delimiters: String): List<String> {
    var word = ""
    var words = listOf<String>()
    for (ch in this) {
        if (ch !in delimiters) // CHANGE
            word += ch // Compose word
        else {
            // Add word to words list
            words += word
            // Reset word
            word = ""
        }
    }
    // Add last word
    words += word

    return words
}



fun main() {
//    val question1 = "Introduza dois chars numa linha separados por espaco"
//    val list1 = readTwoChars(question1)
//    println("Chars introduzidos:")
//    println(list1)
    /*
Introduza dois chars numa linha separados por espaco
a b
Chars introduzidos:
[a, b]
     */

//    val question2 = "Introduza dois inteiros, um em cada linha"
//    val list2 = readTwoNumbers(question2)
//    println("Inteiros introduzidos:")
//    println(list2)
/*
Introduza dois inteiros, um em cada linha
12
2
Inteiros introduzidos:
[12, 2]
 */

//    val question3 = "Introduza varios inteiros, todos na mesma linha, separados por espaco"
//    val list3 = readNumbers(question3)
//    println("Inteiros introduzidos:")
//    println(list3)
/*
Introduza varios inteiros, todos na mesma linha, separados por espaco
12 3 4 -1 0 5
Inteiros introduzidos:
[12, 3, 4, -1, 0, 5]
 */
//    val chars = listOf<Char>('O', 'l', 'a', ' ', 'b', 'o', 'm', ' ', 'd', 'i', 'a')
////    printChars(chars)
//    chars.printChars1()

/*
O
l
a

b
o
m

d
i
a
 */

    val sentence = "Ola bom  *dia"
    val words: List<String> = sentence.splitSimple(' ')
    println(words)

    val words1: List<String> = sentence.split1("* ")
    println(words1)
/*
[Ola, bom, , *dia]
[Ola, bom, , , dia]
 */
}






















