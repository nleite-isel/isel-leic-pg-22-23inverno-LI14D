

// Normal function
fun digitToIntFunc(ch: Char): Int {  
	if (ch !in '0'..'9')
		throw Exception("char parameter must be a digit")
	else
		return ch - '0' // Convert digit to Int
}

// Same behaviour as above but using an extension function
fun Char.digitToInt(): Int {
	if (this !in '0'..'9')
		throw Exception("char parameter must be a digit")
	else
		return this - '0' // Convert digit to Int
}


fun main() {
	// Using normal function
//	val dig1: Int = digitToIntFunc('@')  // Exception
	val dig2: Int = digitToIntFunc('2')  
	println(dig2)
	
	// Using extension function
//	val dig3: Int = 'X'.digitToInt()  // Exception
	val dig4: Int = '9'.digitToInt()
	println(dig4)


}



