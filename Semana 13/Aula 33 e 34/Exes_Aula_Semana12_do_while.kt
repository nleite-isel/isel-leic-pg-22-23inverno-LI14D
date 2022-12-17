

fun printMenu() {
    println("1 - Print")
    println("2 - Exec something")
    println()
    println("E or e - Exit")
}

fun executeCmd(key: Char) {
    when (key) {
        '1' -> printCmd()
        '2' -> execSomethingCmd()
    }
}

fun printCmd() {
    println("Print command")
}

fun execSomethingCmd() {
    println("Exec Something command")
}


fun main() {
/*
    // 1. Do-While exercises
    var option: Char
    do {
        // Print menu
        printMenu()
        // Read key
        option = readln()[0]
        // Execute command
        executeCmd(option)
    }
    while (option !in listOf('e', 'E'))
*/
    // 2. Generates two dice randomly until its sum >= 10
    var dice1: Int
    var dice2: Int
    val domain = 1..6 // Dice domain values
    println("Generating two dice randomly until its sum >= 10")
    var tentative = 1
    do {
        dice1 = domain.random()
        dice2 = domain.random()
        println("tentative #$tentative")
        ++tentative
    }
    while (dice1 + dice2 < 10)
    println("Dices: $dice1 and $dice2")

}




















