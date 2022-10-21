

fun main() {

	val list: List<Int> = listOf(10, 11, 12, 13, 14, 15)
	// Print list 
	println(list)
	
	// Print list, one per line, using forEachIndexed function

	list.forEachIndexed { index: Int, elem: Int -> 
		println("index = $index, element = $elem")  // "elem" is the current value being iterated
		// "index" is its index in the list
	}
	
	// filter function applied to list "list"
	// When using filter we intend to "filter" the given list into another new list, which could be
	// the same (no element was filtered) or smaller (some elements or all elements were filtered)
	val newList: List<Int> = list.filter {	it % 2 == 0 } // filter receives a boolean condition
	
	println("newList = $newList")

}


















