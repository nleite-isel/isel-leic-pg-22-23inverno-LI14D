fun main() {
	
	println("Time Decomposer")
	println("Tempo em segundos ?")
		
	val totalSec: Int = readln().toInt()
	println("O tempo em segundos, $totalSec, decomposto fica :")
	
	val hour: Int = totalSec / 3600
	val remainingSec: Int = totalSec % 3600		
	val min: Int = remainingSec / 60
	val sec: Int = remainingSec % 60		
	
	println("Horas: $hour")
	println("Mins: $min")
	println("Segs: $sec")
	
}
