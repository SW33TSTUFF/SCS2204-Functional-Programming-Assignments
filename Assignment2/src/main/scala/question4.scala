object question4 extends App {

  val flatPerformancePrice = 500

  def attendance(ticketPrice: Int):Int = {
    var gradient = (120 - 100) / (15 - 20) // -4
    var intercept = 120 + 15*4 // y = m(gradient) + c
    gradient * ticketPrice + intercept
  }

  def baseProfit(ticketPrice: Int, totalAttendance: Int): Int = {
    ticketPrice * totalAttendance
  }

  def costPerAttendee(count: Int): Int = {
    3 * count
  }

  def trueProfit(ticketPrice: Int): Int = {
    baseProfit(ticketPrice, attendance(ticketPrice)) - (costPerAttendee(attendance(ticketPrice)) + flatPerformancePrice)
  }

  println("Profit at Rs. 5 : " + trueProfit(5)) // cannot go any lower than 5
  println("Profit at Rs. 10 : " + trueProfit(10))
  println("Profit at Rs. 15 : " + trueProfit(15))
  println("Profit at Rs. 20 : " + trueProfit(20))
  println("Profit at Rs. 25 : " + trueProfit(25))
  println("Profit at Rs. 30 : " + trueProfit(30))
  println("Profit at Rs. 35 : " + trueProfit(35))
  println("Profit at Rs. 40 : " + trueProfit(40)) // cannot have attendance any less than 20

  println("The best ticket price is Rs. 25 with a total profit of Rs. " + trueProfit(25))
}
