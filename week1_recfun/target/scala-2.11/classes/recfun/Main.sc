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
    * Lesson
    */
//  def abs(x:Double) = if (x < 0) -x else x
//
//  def sqrtIter(guess: Double, x: Double): Double =
//    if (isGoodEnough(guess, x)) guess
//    else sqrtIter(improve(guess, x), x)
//
//  def isGoodEnough(guess: Double, x: Double) =
//    abs(guess * guess - x) < 0.001
//
//  def improve(guess: Double, x: Double) =(guess + x / guess) / 2
//
//  def sqrt(x: Double) = sqrtIter(1.0, x)

  /**
    * Exercise 1
    */
  def pascal(c: Int, r: Int): Int =
    if (c == 0 || c == r) 1
    else pascal(c - 1, r - 1) + pascal(c, r - 1)

  /**
    * Exercise 2
    */
  def balance(chars: List[Char]): Boolean = false

  // true
  balance("(if (zero? x) max (/ 1 x))".toList)
  balance("I told him (that it’s not (yet) done). (But he wasn’t listening)".toList)

  // false
  balance(":-)".toList)
  balance("())(".toList)


  /**
    * Exercise 3
    */
  def countChange(money: Int, coins: List[Int]): Int = 0
}
