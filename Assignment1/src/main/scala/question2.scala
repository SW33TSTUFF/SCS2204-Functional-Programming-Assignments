object question2 extends App{
  def celsiusToFahrenheit(temperature:Double):Double =
    temperature * 1.80000 + 32.00

  val convertedTemperature = celsiusToFahrenheit(35)
  println(convertedTemperature)
}
