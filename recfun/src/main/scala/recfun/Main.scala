package recfun

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
    * Exercise 1
    */
  def pascal(c: Int, r: Int): Int =
    if (c == r || c == 0) 1
    else pascal(c - 1, r - 1) + pascal(c, r - 1)


  /**
    * Exercise 2
    */
  def balance(chars: List[Char]): Boolean =
    balanceAux(0, chars)

  def balanceAux(acc: Int, chars: List[Char]): Boolean =
    if (chars.isEmpty) acc == 0
    else if (acc < 0) false
    else {
      if (chars.head == '(') balanceAux(acc + 1, chars.tail)
      else if (chars.head == ')') balanceAux(acc - 1, chars.tail)
      else balanceAux(acc, chars.tail)
    }

  /**
    * Exercise 3
    */
  def countChange(money: Int, coins: List[Int]): Int =
    if (money == 0) 1
    else if (money < 0 || coins.isEmpty) 0
    else countChange(money, coins.tail) + countChange(money - coins.head, coins)
}
