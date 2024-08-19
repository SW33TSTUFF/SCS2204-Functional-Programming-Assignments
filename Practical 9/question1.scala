import scala.io.StdIn.readLine
object question1 extends App {
    val depositValue = readLine("Enter deposit amount: ").toDouble
    

    val interestAmount = (depositValue: Double) => {
        depositValue match {
            case deposit if deposit <= 20000 => deposit * 0.02
            case deposit if deposit <= 200000 => deposit * 0.04
            case deposit if deposit <= 2000000 => deposit * 0.035
            case _  => depositValue * 0.065 // but in the question it says more than 200000, I assume that its a typing error
        }
    }

    println("The deposited amount: " + depositValue)
    println("The interest amount for the deposited value: " + interestAmount(depositValue))
    println("Total amount that can be expected per year: " + (depositValue + interestAmount(depositValue)))
}