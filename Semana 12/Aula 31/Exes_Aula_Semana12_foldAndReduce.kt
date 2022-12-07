
//Funções fold  e reduce aplicadas a listas.
//
fun main() {

    val list = listOf<Int>(1, 2, 3, 4, 5)
    // Fold is an aggregator function - Given an initial accumulator, yields the next accumulator
    val res: Int = list.fold(0) { acc: Int, elem: Int ->
        acc + elem // Next acc, so in this way it sums up all elements of list
    }
    println("res = $res") // 15

    // Reduce is an aggregator function, similar to fold but does not receive the initial accumulator; the accumulator is zero by default
    val res1: Int = list.reduce { acc: Int, elem: Int ->
        acc + elem // Next acc, so in this way it sums up all elements of list
    }
    println("res1 = $res1") // 15

}
















