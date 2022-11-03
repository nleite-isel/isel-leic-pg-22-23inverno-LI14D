
package myprograms

import pt.isel.canvas.*

//fun myFunc(): Unit  {
//    val arena = Canvas(300, 200, CYAN)
//    print("Start ")
//}

data class Player(val stamina: Int, val health: Int = 90)

fun main() {
    print("Begin ")
    val player1: Player = Player(100, 100)
    println("player1.stamina = ${player1.stamina}")
    println("player1.health = ${player1.health}")
    // Or, simply:
//    println(player1.toString())
    println(player1)

    val player2 = Player(health = 100, stamina = 100)
    val player3 = Player(stamina = 100)

//    onStart(::myFunc)

    onStart {
        val arena = Canvas(300, 200, CYAN)
        print("Start ")
    }

//    onStart( fx = {
//        val arena = Canvas(300, 200, CYAN)
//        print("Start ")
//    })
//

    onFinish {
        print("Finish ")
    }
    print("End ")
}
