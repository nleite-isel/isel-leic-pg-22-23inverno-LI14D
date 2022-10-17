
fun celsiusToFahrenheit(celsius: Double): Double {
	val fahrenheit: Double = celsius * 9 / 5 + 32
	return fahrenheit
}

// Ou:
fun celsiusToFahrenheit2(celsius: Double): Double {
	return celsius * 9 / 5 + 32
}

// Ou:
fun celsiusToFahrenheit3(celsius: Double) = celsius * 9 / 5 + 32





fun main() {

	// Elabore um programa em REPL que converta graus Celsius para Fahrenheit, usando a fórmula: 
	// 
	// Cº = 5 * (Fº - 32) / 9 
	//
	
	
	println("Celsius to Fahrenheit")
	
	println("Introduza os graus Celsius: ")
	//val celsius: Double = 36.7
	// readln() reads a line of text
	// toInt() converts String to Int
	// toDouble() converts String to Double
	val celsius: Double = readln().toDouble()
	
	println("Celsius = $celsius") // Print val contents
	
	// val fahrenheit: Double = celsius * 9 / 5 + 32
//	val fahrenheit: Double = celsiusToFahrenheit(celsius)
//	val fahrenheit: Double = celsiusToFahrenheit2(celsius)
	val fahrenheit: Double = celsiusToFahrenheit3(celsius)
	
	println("$celsius graus C e' igual a $fahrenheit graus F")

}
