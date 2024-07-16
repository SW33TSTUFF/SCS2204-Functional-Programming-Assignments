object question3 extends App {
    import scala.io.StdIn

    def fibonacci(n: Int): Int = {
    if (n <= 0) 0
    else if (n == 1) 1
    else fibonacci(n - 1) + fibonacci(n - 2)
    }

    def printFibonacci(n: Int): Unit = {
    for (i <- 0 until n) {
        print(s"${fibonacci(i)} ")
    }
    }

    print("Enter a number: ")
    val n = StdIn.readInt()
    println("First n Fibonacci number ")
    printFibonacci(n)

}