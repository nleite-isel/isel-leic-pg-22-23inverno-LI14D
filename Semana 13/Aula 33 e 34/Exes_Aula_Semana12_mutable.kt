
/*
Listas mutáveis;
O tipo Array<T>; os tipos IntArray e DoubleArray;
 */
fun main() {
    // Mutable list declared with val instead with var.
    val mutableList: MutableList<Int> = mutableListOf(1, 3, 2, 7, 1)
    // Change a value without creating a copy of the list
    mutableList[mutableList.lastIndex] = 99
    // Print contents
    println(mutableList)
    // Add a value to the end
    mutableList.add(-2)
    // Remove a given value
    mutableList.remove(7)
    // Print contents
    println(mutableList)

    // Arrays
    val array: IntArray = intArrayOf(1, 3, 2, 7, 1)
    // Change a value without creating a copy of the array
    array[array.lastIndex] = 99
    // Print contents
//    println(array) // Print does not work well on arrays
    array.forEach { print("$it ") }
    println()
    // Add a value to the end
//    array.add(-2) // Error, array has fixed dimension


    // Shuffled function implemented on mutable lists
    val newMutableList = mutableList.myShuffled()
    // Print contents
    println("mutableList =$mutableList")
    // Print contents
    println("newMutableList = $newMutableList")


}


// With mutable lists
fun MutableList<Int>.myShuffled(): MutableList<Int> {
    // Create a copy
    val newMutableList = this.toMutableList()
    // Shuffle the list 2 * size of list times
    for (i in 1..2*newMutableList.size) {
        // Generate a random index and swap its contents with the last position
        val randIndex = (0..newMutableList.size-1).random()
        // Swap
        var aux = newMutableList[newMutableList.lastIndex]
        newMutableList[newMutableList.lastIndex] = newMutableList[randIndex]
        newMutableList[randIndex] = aux
    }

    return newMutableList
}



















