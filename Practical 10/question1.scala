class Rational(val p: Int, val q: Int) {
  require(q != 0, "Denominator q value cannot be zero")

  def neg: Rational = new Rational(-p, q)

  def add(that: Rational): Rational = {
    val newNumer = this.p * that.q + this.q * that.p
    val newDenom = this.q * that.q

    if (newNumer == 0) new Rational(0, 1)
    else new Rational(newNumer, newDenom)
  }

  // Override toString to display the rational number
  override def toString: String = if (p == 0) "0" else p + "/" + q
}

object RationalMain {
  def main(args: Array[String]): Unit = {
    val value_1 = new Rational(1, 2)
    val value_2 = new Rational(4, 5)

    println("Value 1: " + value_1)
    println("Neg of Value 1: " + value_1.neg)
    println("Neg of Value 2: " + value_2.neg)

    // Add value_1 and its negation
    println("Value 1 + (- Value 1): " + value_1.add(value_1.neg))

    // Add value_1 and value_2
    println("Value 1 + Value 2: " + value_1.add(value_2))
  }
}

