object question4 extends App {
  val coverPrice: Double = 24.95
  val bCount: Int = 60
  val shipFirst: Double = 3
  val shipAdditional: Double = 0.75
  val discount: Double = 0.4
  
  val wholesalePrice = coverPrice * (1 - discount)
  val totalCost = if (bCount < 50) ((wholesalePrice + shipFirst) * bCount)
  	else (((wholesalePrice + shipFirst) * 50) + ((wholesalePrice + shipAdditional) * (bCount - 50)))

	
  println(s"The total wholesale cost for $bCount copies is Rs. $totalCost")
}

