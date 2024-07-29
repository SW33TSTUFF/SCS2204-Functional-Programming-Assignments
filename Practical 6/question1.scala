object InventorySystem extends App {

  case class Product(id: Int, name: String, quantity: Int, price: Double)

  val inventory1: Map[Int, Product] = Map(
    101 -> Product(101, "Laptop", 10, 999.99),
    102 -> Product(102, "Mouse", 50, 19.99),
    103 -> Product(103, "Keyboard", 30, 49.99)
  )

  val inventory2: Map[Int, Product] = Map(
    102 -> Product(102, "Mouse", 30, 18.99), 
    104 -> Product(104, "Monitor", 20, 199.99)
  )

  def getAllProductNames(inventory: Map[Int, Product]): List[String] = {
    inventory.values.map(_.name).toList
  }

  def calculateTotalValue(inventory: Map[Int, Product]): Double = {
    var sum: Double = 0.0
    inventory.keys.foreach { key =>
    val product = inventory(key)
    sum += product.quantity * product.price
    }
    return sum

  }

  def isInventoryEmpty(inventory: Map[Int, Product]): Boolean = {
    inventory.isEmpty
  }

def mergeInventories(inventory1: Map[Int, Product], inventory2: Map[Int, Product]): Map[Int, Product] = {
  val mergedKeys = inventory1.keySet ++ inventory2.keySet

  mergedKeys.map { key =>
    (inventory1.get(key), inventory2.get(key)) match {
      case (Some(prod1), Some(prod2)) =>
        key -> Product(
          id = prod1.id,
          name = prod1.name,
          quantity = prod1.quantity + prod2.quantity,
          price = math.max(prod1.price, prod2.price)
        )
      case (Some(prod), None) => key -> prod
      case (None, Some(prod)) => key -> prod
      case (None, None) => throw new IllegalStateException("SCALA ERROR")
    }
  }.toMap
}


  def printProductDetails(inventory: Map[Int, Product], productId: Int): Unit = {
    inventory.get(productId) match {
      case Some(product) => println(s"Product found: $product")
      case None => println(s"Product with ID $productId does not exist.")
    }
  }

  // q1
  println(getAllProductNames(inventory1))


  // q2
  println(calculateTotalValue(inventory1))

  // q3
  println(isInventoryEmpty(inventory1))

  // q4
  val mergedInventory = mergeInventories(inventory1, inventory2)
  println(mergedInventory)

  // q5
  printProductDetails(inventory1, 102)
}
