package unitTesting

/**
  * Created by james-forster on 17/04/18.
  */
object NumericalService {

  def singleAtomicCondition(a: Int) = {
    if (a >= 0) "The value is positive"
    else "The value is negative"
  }

  def doubleAtomicCondition(a: Int, b: Int) = {
    if (a >= 0 && b >= 0) "Both values are positive"
    else "Both values are not positive"
  }

  def extendedDoubleAtomicCondition(a: Int, b: Int, c: Int) = {
    if (a >= 0 && b >= 0) {
      if (c == 0) "C has an empty value"
      else "C has a non-empty value"
    } else "Both values are positive"
  }

  def complexDoubleAtomicCondition(a: Int, b: Int) = {
    if (a >= 0 && b >= 0) "Both values are positive"
    else if (a < 0 && b < 0) "Both values are negative"
    else "Only one value is positive"
  }

  def tripleAtomicCondition(a: Int, b: Int, c: Int) = {
    if ((a > 0 || b < 5) && c == 0) "The result is true"
    else "The result is false"
  }

  def loopingCondition(a: Int) = {
    def whileLoop(x: Int, count: Int): Int = {
      if (x > 0) whileLoop(x - 1, count + 1)
      else count
    }

    whileLoop(a, 0)
  }

  def multipleCondition(a: Int, b: Int, c: Int) = {
    val modC = if (c < 0) -c else c

    def whileLoop(x: Int, result: Int): Int = {
      if (x > 0) whileLoop(x - modC, result = result + b)
      else result
    }

    if ((a > b) && (b > c) && c != 0)
      whileLoop(10, a)
    else if (c == 0) 0
    else whileLoop(5, 0)
  }
}
