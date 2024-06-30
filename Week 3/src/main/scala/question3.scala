object question3 extends App {
  import scala.math.BigDecimal.RoundingMode

  def calculateAverage(num1: Int, num2: Int): Double = {
    val sum = num1 + num2
    val average = BigDecimal(sum) / 2
    average.setScale(2, RoundingMode.HALF_UP).toDouble
  }

  val input1 = scala.io.StdIn.readLine().toInt
  val input2 = scala.io.StdIn.readLine().toInt

  println(calculateAverage(input1, input2)) // can also use this?? f"$pi%1.5f"

}
