import kotlin.math.ceil
import kotlin.math.round

fun main() {
    print("Quantia em Euros? ")
    val amount =  readLine()!!.toDouble()
    var amountCent : Int = round(amount * 100).toInt()

    println(amount * 100)
    println(amountCent)


//    if (amount == 4.31) // Not correct due to approximation errors
//    val epsilon = 1e-6
//    val epsilon = 1e-3

//    if (amount - 4.31 <= epsilon) // Not correct due to approximation errors
//        println("OK")

//    val v = 1.0 / 3 // 0.333333...
//    if (v == 0.33) // Not correct due to approximation errors
//        println("OK")
//    if (v - 0.33 <= epsilon) // Not correct due to approximation errors
//        println("OK 1")

    val m200: Int
    val m100: Int
    val m50: Int
    val m20: Int
    val m10: Int
    val m5: Int
    val m2: Int

    println() // Print new blank line

    var plus = false

    // 2 Euro
    if (amountCent >= 200) {
        m200 = amountCent / 200
        // Remaining amount
        amountCent %= 200 // Equivalent to amountCent = amountCent % 200
        print("${m200}x2Eu")
        // The next term should have a plus sign '+' before
        plus = true
    }
    // 1 Euro
    if (amountCent >= 100) {
        m100 = amountCent / 100
        // Remaining amount
        amountCent %= 100
        if (plus) print(" + ")
        print("${m100}x1Eu")
        // The next term should have a plus sign '+' before
        plus = true
    }
    // 50 cent
    if (amountCent >= 50) {
        m50 = amountCent / 50
        // Remaining amount
        amountCent %= 50
        if (plus) print(" + ")
        print("${m50}x50c")
        // The next term should have a plus sign '+' before
        plus = true
    }
    // 20 cent
    if (amountCent >= 20) {
        m20 = amountCent / 20
        // Remaining amount
        amountCent %= 20
        if (plus) print(" + ")
        print("${m20}x20c")
        // The next term should have a plus sign '+' before
        plus = true
    }
    // 10 cent
    if (amountCent >= 10) {
        m10 = amountCent / 10
        // Remaining amount
        amountCent %= 10
        if (plus) print(" + ")
        print("${m10}x10c")
        // The next term should have a plus sign '+' before
        plus = true
    }
    // 5 cent
    if (amountCent >= 5) {
        m5 = amountCent / 5
        // Remaining amount
        amountCent %= 5
        if (plus) print(" + ")
        print("${m5}x5c")
        // The next term should have a plus sign '+' before
        plus = true
    }
    // 2 cent
    if (amountCent >= 2) {
        m2 = amountCent / 2
        // Remaining amount
        amountCent %= 2
        if (plus) print(" + ")
        print("${m2}x2c")
        // The next term should have a plus sign '+' before
        plus = true
    }
    // 1 cent
    if (amountCent >= 1) {
        if (plus) print(" + ")
        print("1x1c")
    }
    println() // Print new blank line
}











