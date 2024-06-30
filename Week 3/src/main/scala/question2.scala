object question2 extends App {
  val stringList: List[String] = List("apples", "oranges", "pears", "banaaaana") // list of strings
  def stringCap(stringList:List[String], number:Int): List[String] = {
    return stringList.filter(_.length>number)
  }
  val newList = stringCap(stringList, 5)
  println(newList)
}
