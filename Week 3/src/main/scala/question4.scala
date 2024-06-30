object question4 extends App{
  val stringList: List[Int] = List(1, 2, 3, 4, 5)
  def evenNumberSum(list: List[Int]): Int = {
    val evenList = list.filter(_%2 == 0)
    return evenList.sum
  }

  val testSum = evenNumberSum(stringList)
  println("The sum of even numbers in this list is " + testSum) // 6
}
