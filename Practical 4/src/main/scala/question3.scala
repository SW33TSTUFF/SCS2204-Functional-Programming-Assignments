object question3 extends App{

  def toUpper(string: String): String = {
    return string.toUpperCase();
  }

  def toLower(string: String): String = {
    return string.toLowerCase();
  }

  def FirstTwo(string: String): String = {
    val firstTwo = string.substring(0, 2).toUpperCase
    val rest = string.substring(2)
    return firstTwo + rest
  }

  def last(string: String): String = {
    val lastChar = string.last.toUpper
    val initialPart = string.dropRight(1)
    return initialPart + lastChar
  }

  def formatNames(f: (s: String) => String, str: String): String = {
    var name = f(str);
    return name;
  }


  println(formatNames(toUpper, "Benny"));
  println(formatNames(FirstTwo, "Niroshan"));
  println(formatNames(toLower, "Saman"));
  println(formatNames(last, "Kumara"));

}
