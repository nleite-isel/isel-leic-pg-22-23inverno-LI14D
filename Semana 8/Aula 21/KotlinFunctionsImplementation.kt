

// Implementação das funções de extensão da biblioteca Kotlin: forEach, forEachIndexed, map, mapIndexed, filter;

//
// forEach
//
fun List<Int>.forEach1(func: (value: Int) -> Unit): Unit {
//    for (elem in this)
//        func(elem) // Call function func received as argument, for each element in list this
    // Or:
//    for (idx in 0 until this.size)
//        func(this[idx]) // Call function func received as argument, for each element in list this
    // Or:
    var idx = 0
    while (idx < this.size) {
        func(this[idx]) // Call function func received as argument, for each element in list this
        ++idx
    }
}

//
// forEachIndexed receives a function that is called with two arguments> index and value, for each element in the list
//
fun List<Int>.forEachIndexed1(func: (index: Int, value: Int) -> Unit): Unit {
//    for (idx in 0 .. this.size - 1)
//        func(idx, this[idx]) // Call function func received as argument, for each element in list this
    // Or:
    var idx = 0
    while (idx < this.size) {
        func(idx, this[idx]) // Call function func received as argument, for each element in list this
        ++idx
    }
}

//
// map
//
fun List<Int>.map1(func: (value: Int) -> Int): List<Int> {
    var newList: List<Int> = emptyList()
    for (elem in this)
        newList += func(elem) // Call function func received as argument, for each element in list this

    return newList
}


//
// mapIndexed
//
fun List<Int>.mapIndexed1(func: (index: Int, value: Int) -> Int): List<Int> {
    var newList: List<Int> = emptyList()
    for (idx in this.indices)
        newList += func(idx, this[idx]) // Call function func received as argument, for each element in list this

    return newList
}



//
// filter
//
fun List<Int>.filter1(func: (value: Int) -> Boolean): List<Int> {
    var newList: List<Int> = emptyList()
    for (elem in this) {
        if (func(elem) == true) // Call function func received as argument, for each element in list this
            newList += elem // Add elem if func evaluates true
    }

    return newList
}




fun globalFunc(value: Int): Unit {
    print("$value ")
}


fun main() {
    val list: List<Int> = listOf(1, 2, 3, 4)
    list.forEach1 { println(it) }
/*
Output:
1
2
3
4
 */
    // Or:
    // Define local function
    var fx: (Int) -> Unit = { println(it) }
    list.forEach1(fx)
    /*
    Output:
    1
    2
    3
    4
     */
    // Or:
    // Define local function
    fx = { elem: Int -> Unit
        println(elem) }
    list.forEach1(fx)
    /*
Output:
1
2
3
4
 */
    // Or:
    // Define local function (we can omit types in the function declaration)
    fx = { elem ->
        println(elem) }
    list.forEach1(fx)
    /*
Output:
1
2
3
4
 */
    // Or:
    // Define global function
    // In this case, we have to use the address operator ::
    list.forEach1(::globalFunc)
    println()
    /*
    Output:
    1 2 3 4
     */
    /////////////////////////////////////
    list.forEachIndexed1( func = { index: Int, value: Int ->  println("$index; $value") } )
    /*
    Output:
0; 1
1; 2
2; 3
3; 4
     */
    /////////////////////////////////////
    val resList: List<Int> = list.map1 { it * 10 }
    println(resList)
    /*
    Output:
[10, 20, 30, 40]
     */
    /////////////////////////////////////
    val resList1: List<Int> = list.mapIndexed1 { index, value ->  index * value }
    println(resList1)
    /*
    Output:
[0, 2, 6, 12]
     */
    /////////////////////////////////////
    val resList2: List<Int> = list.filter1 { it % 2 == 0 } // Returns only even list's values
    println(resList2)
    /*
    Output:
[2, 4]
     */
}