
fun main() {

	println("Enter product price in Euros: ")
	val price: Double = readln().toDouble()
	
	println("Enter payment in Euros: ")
	val payment: Double = readln().toDouble()
	
	if (payment < price) {
		println("Payment is not enough")
		println("Ending...")
	}
	else {
		val change: Double = payment - price
		println("Change: $change")
	}

}

/*

Enter product price in Euros: 
1.22
Enter payment in Euros: 
1.3
Change: 0.08000000000000007

*/










