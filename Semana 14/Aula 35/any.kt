
// function any

fun main() {
    println("any:\n")

    // fun <T> Iterable<T>.any(): Boolean
    // Returns true if collection has at least one element.
    val emptyList = emptyList<Int>()
    println("emptyList.any() is ${emptyList.any()}") // false

    val nonEmptyList = listOf(1, 2, 3)
    println("nonEmptyList.any() is ${nonEmptyList.any()}") // true

    ////////////////////////////////////////////////////
    println("any with predicate:\n")
    // inline fun <T> Iterable<T>.any(
    //     predicate: (T) -> Boolean
    // ): Boolean
    //
    // Returns true if at least one element matches the given predicate.

    val isEven: (Int) -> Boolean = { it % 2 == 0 }
    val zeroToTen = 0..10
    println("zeroToTen.any { isEven(it) } is ${zeroToTen.any { isEven(it) }}") // true, Not so efficient because it
    // creates another lambda expression that calls isEven inside
    println("zeroToTen.any(isEven) is ${zeroToTen.any(isEven)}") // true, OK
    println("zeroToTen.any { it % 2 == 0 } is ${zeroToTen.any { it % 2 == 0 }}") // true, OK

    val odds = zeroToTen.map { it * 2 + 1 }
    println("odds = $odds")
    println("odds.any { isEven(it) } is ${odds.any { isEven(it) }}") // false

    val emptyList1 = emptyList<Int>()
    println("emptyList.any { true } is ${emptyList1.any { true }}") // false. Invokes any with predicate { true }

    println("odds.any { true } is ${odds.any { true }}") // true
}
















