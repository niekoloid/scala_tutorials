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
      if (c == 0 || c == r) 1
      else pascal(c - 1, r - 1) + pascal(c, r - 1)
  
  /**
   * Exercise 2
   */
    def balance(chars: List[Char]): Boolean = {
      def deeper(cs: List[Char], depth: Int): Boolean = cs match {
        case Nil => depth == 0
        case ')' :: _ if depth < 1 => false
        case ')' :: ccs => deeper(ccs, depth - 1)
        case '(' :: ccs => deeper(ccs, depth + 1)
        case _ :: ccs => deeper(ccs, depth)
      }
      deeper(chars, 0)
    }

  /**
   * Exercise 3
   */
    def countChange(money: Int, coins: List[Int]): Int = {
      val combs = Array.fill(money + 1)(0)
      combs(0) = 1
      coins.foreach(coin =>
        for (j <- coin to money)
          combs(j) = combs(j) + combs(j - coin)
      )
      combs(money)
    }
}
