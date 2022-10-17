
fun readDouble(quest :String): Double {
	print("$quest? ")
    return readln().trim().toDouble()
}


fun main() {

    println("CalculatorWhen")

    val op1: Double = readDouble("Introduza o 1.) operando")

    println("Introduza o operador")
    val opr: Char = readln()[0]

    val op2: Double = readDouble("Introduza o 2.) operando")
    val res: Double = when (opr) {
        '+'  -> op1 + op2
        '-'  -> op1 - op2
        '/'  -> op1 / op2
        'x'  -> op1 * op2
        else -> op1 % op2
    }
    // Neste caso, se o operador for invalido e' assumido o operador '%'

    println("$op1 $opr $op2 = $res")
}
/*
CalculatorIf
Introduza o 1.) operando? 3
Introduza o operador
x
Introduza o 2.) operando? 2
3.0 x 2.0 = 6.0
 */
