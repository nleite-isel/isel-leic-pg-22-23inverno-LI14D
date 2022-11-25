

// Override operator + in type Int
// Notice the keyword *operator*
operator fun Int.plus(value: Int): Int = this + value

data class Position(val col: Int, val line: Int)
// Operator + on Position type
operator fun Position.plus(other: Position): Position = Position(col = this.col + other.col, this.line + other.line)

fun main() {
    val x = 10
    val y = x.plus(5)
    println(y) // 15
    // Or:
    val y1 = x + 5
    println(y1) // 15
    /////////////////////////////////
    val pos1 = Position(10, 3)
    val pos2 = Position(-1, 0) // Equivalent to going LEFT
    val newPosition = pos1.plus(pos2)
    println(newPosition) // Position(col=9, line=3)
    // Or:
    val newPosition1 = pos1 + pos2
    println(newPosition1) // Position(col=9, line=3)
}