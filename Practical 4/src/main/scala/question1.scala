object question1 extends App {
  var items = Array("Shirt", "Short", "Pants")
  var quantity = Array(4, 3, 4)

  def showInventory(i:Int = 0):Unit = {
    if (i == items.length) return
    else
      println(items(i) + " - " + quantity(i))
      showInventory(i+1)
  }


  //item name and a quantity as parameters

  def addQuantity(itemName: String, count:Int):Unit = {
    val i = itemName.indexOf(itemName)
    if (i >= 0){
      quantity(i) += count
      println(itemName + " - " + quantity(i))
    } else {
      println("This item is not in the array")
    }

  }

  def sellItem(itemName: String, count: Int): Unit = {
    val i = itemName.indexOf(itemName)
    if(i >= 0) {
      if (quantity(i) >= count) {
        quantity(i) = quantity(i) - count
        println("Sold " + quantity(i) + " of " + itemName)
      } else {
        println(s"Only ${quantity(i)} of $itemName is available")
      }
    } else {
      println(s"$itemName does not exist")
    }

  }


  showInventory()
  addQuantity("Short", 5)
  showInventory()
  sellItem("Short", 3)
  sellItem("Shirt", 1)
  showInventory()
}
