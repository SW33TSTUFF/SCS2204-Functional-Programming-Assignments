object question2 extends App{
  var a: Int = 2
  var b: Int = 3
  var c: Int = 4
  var d: Int = 5
  var k: Float = 4.3f

  b = b - 1
  println(" --b * a + c *d-- : " + (b*a + c*d));
  d = d - 1

  println("a++ : " + a)
  a = a + 1

  var g = 7
  println("-2 * (g - k) + c : " + -2*(g-k)+c) // g is not given!! took g as 7
  println("c=c++ : " + c)
  c = c + 1

  c = c + 1
  println("c=++c*a++ : " + c * a)
  a = a + 1
}
