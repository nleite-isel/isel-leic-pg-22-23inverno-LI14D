

fun main() {

	val list: List<Int> = listOf(10, 11, 12)
	// Print list 
	println(list)
	
	// Print list, one per line, using forEach function

	list.forEach {
		println(it)  // "it" is the current value being iterated
	}
	
	// map function applied to list "list"
	// When using map we intend to "transform" given list in another new list
	val newList: List<Int> = list.map {
		it + 1 // Iterates original list an, in each iteration, produces a new element it + 1,
		// original one plus 1. This element will be added to the new list "newList"
	}
	
	println("newList = $newList")
	

	// mapIndexed function - similar to map but receives two parameters, index and current element 
	// The current element is *not* usually named "it" in this case
	// The name "it" is only used if it is the only parameter
	val newList1: List<Int> = list.mapIndexed { index: Int, elem: Int ->
		println("Current index = $index, current elem = $elem")
		// it + 1 // Error, "it" does not exist!
		elem + 1 // Iterates original list an, in each iteration, produces a new element it + 1,
		// original one plus 1. This element will be added to the new list "newList"
	}
	
	println("newList1 = $newList1")
	

}
