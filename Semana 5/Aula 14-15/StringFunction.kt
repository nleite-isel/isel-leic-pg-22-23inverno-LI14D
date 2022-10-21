
fun String.toInt(): Int {
	var pow = 1 // power values> 1, 10, 100, ...
	var dec = 0 // Converted number in decimal
	println("Inside my extension function String.toInt()...")
	println(this) // The given string to work with
	
	// For instance, if this = "123" then dec = 3*1 + 2*10 + 1*100 = 123 (in decimal)  
	for (i in this.length - 1 downTo 0) {
		val digit = this[i] - '0'
		dec += digit * pow 
		pow *= 10
	}
	
	return dec
}



fun main() {
	val str: String = "123"
	val number: Int = str.toInt() // Calls extension function defined above
	
	// Print 
	println("String $str converted to number is $number")

}
