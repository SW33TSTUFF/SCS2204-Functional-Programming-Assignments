object question3 extends App {
  def normal(hour: Int): Double = {
    250 * hour
  }

  def ot(hour: Int): Double = {
    85 * hour
  }

  def total(normalHour: Int, otHour: Int): Double = {
    normal(normalHour) + ot(otHour)
  }

  def taxAmount(normalHour: Int, otHour: Int): Double = {
    total(normalHour, otHour) * 0.12
  }

  def takeHomeSalary(normalHour: Int, otHour: Int): Double = {
    total(normalHour, otHour) - taxAmount(normalHour, otHour)
  }

  val salary = takeHomeSalary(40, 30)
  println("Take home salary of a typical employee (Rs.): " + salary)
}
