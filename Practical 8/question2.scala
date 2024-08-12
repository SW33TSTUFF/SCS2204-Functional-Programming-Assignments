import scala.io.StdIn.readLine

object question2 extends App {
    val categorize = (inputValue:Int) => {
        inputValue match {
            case num if num % 3 == 0 && num % 5 == 0 => "Multiple of Both Three and Five"
            case num if num % 3 == 0                 => "Multiple of Three"
            case num if num % 5 == 0                 => "Multiple of Five"
            case _                                   => "Not a Multiple of Three or Five"
        }
    }

    val input = readLine("Please enter an integer: ").toInt
    println(categorize(input))
}
