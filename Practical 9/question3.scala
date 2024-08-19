object question3 extends App{

  val toUpper = (string: String) => {
    string.toUpperCase()
  }

  val toLower = (string: String) => {
    string.toLowerCase()
  }


  val firstTwo = (string: String) => {
    val stringSet1 = (string: String) => {
        if (string.length > 2)
            toUpper(string.substring(0,2))
        else
            toUpper(string)
    }

    val stringSet2 = (string: String) => {
        if (string.length > 2)
            string.substring(2)
        else
            string
    }

    if(string.length > 2) {
        stringSet1(string) + stringSet2(string)
    } else {
        stringSet1(string)
    }

    
  }

  val lastString = (string: String) => {
    if (string.length > 1) {
        val stringSet1 = (string: String) => {
            string.substring(0, string.length - 1)
        }
        val stringSet2 = (string: String) => {
            toUpper(string.substring(string.length - 1))
        }
       

        stringSet1(string) + stringSet2(string)
    }    
    else
        toUpper(string)
  }


def formatNames(f: String => String, str: String): String = {
  f(str)
}



  println(formatNames(toUpper, "Benny"));
  println(formatNames(firstTwo, "Niroshan"));
  println(formatNames(toLower, "Saman"));
  println(formatNames(lastString, "Kumara"));
  // made sure all the conditions are satisfied :)
//   println(formatNames(firstTwo, "sim"));
//   println(formatNames(firstTwo, "si"));
//   println(formatNames(firstTwo, "s"));
//   println(formatNames(lastString, "ab"));

}