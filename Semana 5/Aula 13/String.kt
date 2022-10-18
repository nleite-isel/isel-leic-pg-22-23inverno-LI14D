
fun main() {

	val str: String = "Bom dia"
	println(str.length)
	println(str.first())
	println(str.last())	
	
	println("Chars of string:")	
	for (ch in str)
		println(ch)
		
	println("Chars of string using indices:")	
	for (i in str.indices)
		println(str[i])

	// Split function
	val words: List<String> = str.split(" ") // Split by space delimiter
	
	println(words)

}



