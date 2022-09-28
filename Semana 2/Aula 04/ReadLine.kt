fun main() {
	
	println("Introduza uma linha de texto: ")
	// readln() reads a line of text
	// toInt() converts String to Int
	// toDouble() converts String to Double
	
	val line: String = readln()
	println("Linha introduzida: $line")
	
	val x: Double = line.toDouble()
	println("Valor double: $x")	
	
}
