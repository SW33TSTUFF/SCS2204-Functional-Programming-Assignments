import scala.io.StdIn

object question1 extends App{

  def getProductList(): List[String] = {
    
    var list: List[String] = List()
    var str: String = ""
    print("Enter product = ")
    str = StdIn.readLine()
    while (str != "done") {
      if (!list.contains(str)) {
        list = list :+ str
      } else {
        println("Product already exists in the list.")
      }
      print("Enter product = ")
      str = StdIn.readLine()
    }
    list
  }

  def printProductList(list: List[String]): Unit = {
    list.zipWithIndex.foreach { case (product, index) =>
      println(s"${index + 1} : $product")
    }
  }

  def getTotalProducts(list: List[String]): Int = {
    list.length
  }

  var list: List[String] = getProductList()
  println("List")
  printProductList(list)
  println("Total number of products: " + getTotalProducts(list))

}
