
// Funções mapNotNull, mapIndexed;
// Funções shuffled; take; sortedBy; any; all;

fun main() {
    // List of nullable Int
    val list = listOf<Int?>(null, 10, -1, 3, null, 4)

    val newList: List<Int> = list.mapNotNull { it } // Return (and build newList with) elements which are not null

    println(newList)
/*
[10, -1, 3, 4]
 */
    val newList1: List<Int?> = list.mapIndexed { idx: Int, elem: Int? ->
        println("$idx; $elem") // Print current element index and element
        elem// Return (and build newList with) elements, despite being null or null
    }

    println(newList1)
    /*
0; null
1; 10
2; -1
3; 3
4; null
5; 4
[null, 10, -1, 3, null, 4]
     */

    // Funções shuffled; take; sorted; any; all;

    val newList2: List<Int?> = list.shuffled()
    println(newList2)
/*
[null, 3, null, -1, 10, 4]
 */
    // Take first 3 elements of list
    val newList3: List<Int?> = list.take(3)
    println(newList3)
    /*
[null, 10, -1]
     */

    // Sort list in ascending order
    val newList4: List<Int> = newList.sorted()
    println("newList = $newList")
    println("After sorting, newList4 = $newList4")
    /*
newList = [10, -1, 3, 4]
After sorting, newList4 = [-1, 3, 4, 10]
     */
}