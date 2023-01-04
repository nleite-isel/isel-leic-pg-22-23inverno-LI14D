

// function all
//
//inline fun <T> Sequence<T>.all(
//    predicate: (T) -> Boolean
//): Boolean
//Returns true if all elements match the given predicate.

fun main() {
    val isEven: (Int) -> Boolean = { it % 2 == 0 }
    val zeroToTen = 0..10
    println("zeroToTen.all { isEven(it) } is ${zeroToTen.all { isEven(it) }}") // false
    println("zeroToTen.all(isEven) is ${zeroToTen.all(isEven)}") // false

    val evens = zeroToTen.map { it * 2 }
    println("evens = $evens")
    println("evens.all { isEven(it) } is ${evens.all { isEven(it) }}") // true

    val emptyList = emptyList<Int>()
    println("emptyList.all { false } is ${emptyList.all { false }}") // true
    println("emptyList.all { true } is ${emptyList.all { true }}") // true
    println("emptyList.all { it % 2 == 0 } is ${emptyList.all { it % 2 == 0 }}") // true

}











