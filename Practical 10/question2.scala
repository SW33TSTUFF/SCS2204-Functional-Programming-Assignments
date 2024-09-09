class Rational(val p: Int, val q: Int) {
  require(q != 0, "Denominator q value cannot be zero")

  def neg: Rational = new Rational(-p, q)

  // Addition method
  def add(that: Rational): Rational = {
    val newNumer = this.p * that.q + this.q * that.p
    val newDenom = this.q * that.q

    if (newNumer == 0) new Rational(0, 1)
    else new Rational(newNumer, newDenom)
  }

  // Subtraction method
  def sub(that: Rational): Rational = {
    val newNumer = this.p * that.q - this.q * that.p
    val newDenom = this.q * that.q

    if (newNumer == 0) new Rational(0, 1)
    else new Rational(newNumer, newDenom)
  }

  override def toString: String = if (p == 0) "0" else p + "/" + q
}

object question2 {
  def main(args: Array[String]): Unit = {
    val value_1 = new Rational(1, 2)
    val value_2 = new Rational(4, 5)

    println("Value 1: " + value_1)
    println("Neg of Value 1: " + value_1.neg)
    println("Neg of Value 2: " + value_2.neg)

    println("Value 1 + (- Value 1): " + value_1.add(value_1.neg))

    println("Value 1 + Value 2: " + value_1.add(value_2))

    // question 2 part

    val x = new Rational(3, 4)
    val y = new Rational(5, 8)
    val z = new Rational(2, 7)

    // y - z
    println("y - z = " + y.sub(z))

    //x - (y - z)

    println("x - (y - z) = " + x.sub(y.sub(z)))
  }
}
