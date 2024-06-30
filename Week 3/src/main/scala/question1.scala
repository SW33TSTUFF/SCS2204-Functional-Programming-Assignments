object question1 extends App{
  val userInput = scala.io.StdIn.readLine()
  def reverseString(inputString :String):String = {
    // base case
    if (inputString.length == 1 || inputString == null) return inputString
    return reverseString(inputString.substring(1)) + inputString.charAt(0)
  }

  val outputString = reverseString(userInput)
  println("The reverse of " + userInput + " is " + outputString)
}
