object Question1 extends App {

    val inputList1 = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val inputList2 = List(1,2,3,4,5)


    val filterEvenNumbers = (inputList: List[Int]) => {
        inputList.filter(x => x%2 == 0)
    }

    val calulateSquare = (inputList: List[Int]) => {
        inputList.map(x => x*x)
    }

    val filterPrime = (inputList: List[Int]) => {
        inputList.filter(x => x > 1 && !((2 until x-1) exists (x % _ == 0)))
    }

    println(filterEvenNumbers(inputList1))
    println(calulateSquare(inputList2))
    println(filterPrime(inputList1))
}
