// import scala.io.StdIn.readLine

object question2 extends App {
    
    val patternMatching = (inputValue:Int) => {
        val numberParity = (inputValue:Int) => {
            Math.abs(inputValue) match {
                case x if x%2 == 0 => "Even"
                case _ => "Odd"
            }
        }

        val numberSign = (inputValue:Int) => {
            inputValue match {
                case 0 => "Zero"
                case x if x < 0 => "Negative"
                case _ => "Positive"
            }
        }

        if (Math.abs(inputValue) == 0) {
            println("Zero")
        } else {
            println(s"$inputValue is ${numberParity(inputValue)} and ${numberSign(inputValue)}")

        }
    }

    if(args.length <= 0) {
        println("Enter an integer in the argument")
    } else {
        patternMatching(args(0).toInt)
    }

}