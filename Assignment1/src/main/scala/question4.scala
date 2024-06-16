object question4 extends App {
  val coverPrice: Double = 24.95
  val bookCount: Int = 60
  val discount: Float = 0.4

  def bookCost(coverPrice: Double, bookCount: Int, discount: Float): Double =
    coverPrice * (1 - discount) * bookCount

  def totalWholesaleCost(coverPrice: Double, bookCount: Int, discount: Float): Double =
    if (bookCount <= 50) bookCost(coverPrice, bookCount, discount)
    else bookCost(coverPrice, 50, discount) + bookCost(coverPrice, bookCount - 50, discount)

  val wholesaleCost = totalWholesaleCost(coverPrice, bookCount, discount)
  println(s"The total wholesale cost for $bookCount copies is Rs. $wholesaleCost")

  // Need to double check the logic, same question as the one in the lecture slide
}
