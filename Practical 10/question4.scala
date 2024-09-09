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

class Bank(val accounts: List[Account]) {

  def accountsWithNegativeBalances: List[Account] = {
    accounts.filter(account => account.getBalance < 0)
  }

  def totalBalance: Double = {
    accounts.map(_.getBalance).sum
  }

  def applyInterest(): Unit = {
    accounts.foreach { account =>
      val balance = account.getBalance
      val interest = if (balance > 0) 0.05 else 0.1
      val newBalance = balance * (1 + interest)
      account.deposit(newBalance - balance)
    }
  }
}

object question4 {
  def main(args: Array[String]): Unit = {
    val acc1 = new Account(234.00)
    val acc2 = new Account(-150.00)
    val acc3 = new Account(500.00)
    val acc4 = new Account(-100.00)

    val bank = new Bank(List(acc1, acc2, acc3, acc4))

    println("Accounts with negative balances:")
    bank.accountsWithNegativeBalances.foreach(acc => println("Account balance: " + acc.getBalance))

    println("Total balance of all accounts: Rs." + f"${bank.totalBalance}%.2f")

    bank.applyInterest()

    println("Balances after applying interest:")
    bank.accounts.foreach((acc) => println("Account balance: " + f"${acc.getBalance}%.2f"))
  }
}
