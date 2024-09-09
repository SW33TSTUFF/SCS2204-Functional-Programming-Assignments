class Account(private var currentBalance: Double) {

  def getBalance: Double = currentBalance

  def deposit(amount: Double): Unit = {
    if (amount < 0) {
      println("Can't enter negative amount!")
    } else {
      currentBalance += amount
    }
  }

  def withdraw(amount: Double): Unit = {
    if (amount > 0 && amount <= currentBalance) {
      currentBalance -= amount
    } else {
      if (amount < 0) println("Can't enter negative amount")
      else println("Insufficient funds")
    }
  }

  def transfer(amount: Double, otherAccount: Account): Unit = {
    if (amount > 0 && amount <= currentBalance) {
      this.withdraw(amount)
      otherAccount.deposit(amount)
    } else {
      if (amount > 0) println("Insufficient funds for transfer")
      else println("Transfer amount can't be negative")
    }
  }
}

object question3 {
  def main(args: Array[String]): Unit = {
    val acc1 = new Account(234.00)
    val acc2 = new Account(500.00)

    println("BALANCE")
    println("Balance of acc1: Rs." + acc1.getBalance)
    println("Balance of acc2: " + acc2.getBalance)

    acc1.deposit(200.00)
    println("Depositing Rs.200 into acc1: Rs." + acc1.getBalance)

    acc1.withdraw(150.00)
    println("Withdrawing Rs.150 from acc1: Rs." + acc1.getBalance)

    acc1.transfer(300.00, acc2)
    println("Transferring Rs.300 from acc1 to acc2:")
    println("Account1 balance: Rs." + acc1.getBalance)
    println("Account2 balance: Rs." + acc2.getBalance)
  }
}


