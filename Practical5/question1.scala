object question1 extends App {

    import scala.io.StdIn;

    def getProductList():List[String]={
        var list:List[String] = List();
        var str:String = "";
        print("Enter product =");
        str = StdIn.readLine();
        while(str !="done"){
            print("Enter product =");
            str = StdIn.readLine();
            list = list :+ str;
        }
        return list;
    }

    def printProductList(list:List[String]):Unit = {
        list.zipWithIndex.foreach { case (product, index) =>
            println({index + 1} + $product)
        }
    }

    def getTotalProducts(list:List[String]):Int = {
        list.length;
    }

    var list:List[String] = getProductList();
    println("List")
    printProductList(list);
    println("Total number of products "  + getTotalProducts(list));

}