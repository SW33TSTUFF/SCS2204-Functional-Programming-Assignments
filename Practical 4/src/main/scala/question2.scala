object question2 extends App {

  def scalaMatch(randomNumber: Int): String = randomNumber match {
    case 0 => "ZERO\n"
    case x if x < 0 => "NEGATIVE\n"
    case x if x % 2 == 0 => "EVEN\n"
    case _ => "ODD"
  }

  while (true) {
    val userInput = scala.io.StdIn.readInt()
    println(scalaMatch(userInput))
  }
}
