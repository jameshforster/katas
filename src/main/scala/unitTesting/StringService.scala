package unitTesting

import scala.util.Try

/**
  * Created by james-forster on 18/04/18.
  */
object StringService {

  def checkIsYes(input: String) = {
    input == "Yes"
  }

  def checkIsInteger(input: String) = {
    Try {input.toInt}.fold(_ => false, _ => true)
  }

  def readAndProcess(input: String) = {
    if (checkIsInteger(input)) NumericalService.singleAtomicCondition(input.toInt)
    else if (checkIsYes(input)) "The value is 'Yes'"
    else "Invalid inputs used"
  }

  def complexReadAndProcess(a: String, b: String, c: Int) = {
    if (checkIsInteger(a) && checkIsInteger(b)) NumericalService.multipleCondition(a.toInt, b.toInt, c)
    else if (checkIsInteger(a)) NumericalService.complexDoubleAtomicCondition(a.toInt, c)
    else if (checkIsInteger(b)) NumericalService.doubleAtomicCondition(b.toInt, c)
    else if (checkIsYes(a) || checkIsYes(b)) NumericalService.loopingCondition(c)
    else "Invalid inputs used"
  }
}
