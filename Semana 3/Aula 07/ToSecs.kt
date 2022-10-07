//TimeToSecs.kt

fun main() {
	println("Enter 3 integers representing hour, min, and seconds:")
	print("hour? ")
	val hour: Int = readln().toInt()
	println()

	print("min? ")
	val min: Int = readln().toInt()	
	println()

	print("sec? ")
	val sec: Int = readln().toInt()	
	println()
	
	println(hour)
	println(min)
	println(sec)	
	
	val totalSec: Int = hour * 3600 + min * 60 + sec
	println("total seconds is $totalSec")
}
