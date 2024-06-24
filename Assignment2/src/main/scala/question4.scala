object question4 extends App {

  val flatPerformancePrice = 500

  def baseProfit(ticketPrice: Int, totalAttendance: Int): Int = {
    ticketPrice * totalAttendance
  }

  def costPerAttendee(count: Int): Int = {
    3 * count
  }

  def trueProfit(ticketPrice: Int, totalAttendance: Int): Int = {
    baseProfit(ticketPrice, totalAttendance) - (costPerAttendee(totalAttendance) + flatPerformancePrice)
  }

  println("Profit at Rs. 5 : " + trueProfit(5, 160)) // cannot go any lower than 5
  println("Profit at Rs. 10 : " + trueProfit(10, 140))
  println("Profit at Rs. 15 : " + trueProfit(15, 120))
  println("Profit at Rs. 20 : " + trueProfit(20, 100))
  println("Profit at Rs. 25 : " + trueProfit(25, 80))
  println("Profit at Rs. 30 : " + trueProfit(30, 60))
  println("Profit at Rs. 35 : " + trueProfit(35, 40))
  println("Profit at Rs. 40 : " + trueProfit(5, 20)) // cannot have attendance any less than 20

  println("The best ticket price is Rs. 25 with a total profit of Rs. " + trueProfit(25,80))
}
