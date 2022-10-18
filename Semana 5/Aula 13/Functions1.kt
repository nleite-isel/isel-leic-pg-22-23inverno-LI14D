//
// Implementação com ciclo for, while e função forEach,
// contando o numero de caracteres
//

// Usando while
fun List<Char>.length(): Int {
	var count = 0
	var i = 0
	while (i < this.size) {
		++i
		++count
	}

	return count
}

// Usando for
fun List<Char>.length2(): Int {
	var count = 0
	for (i in 0..this.size - 1) 
		++count

	return count
}


// Usando forEach
fun List<Char>.length3(): Int {
	var count = 0
	this.forEach {
		++count
	}

	return count
}



fun main() {
	val list: List<Char> = listOf('O', 'l', 'a', ' ', 'B', 'o', 'm', ' ', 'd', 'i', 'a')
	println(list) // [O, l, a,  , B, o, m,  , d, i, a]

	
	println(list.size) // 11

	// Using extension functions above
	println(list.length()) // 11
	println(list.length()) // 11
	println(list.length()) // 11
}















