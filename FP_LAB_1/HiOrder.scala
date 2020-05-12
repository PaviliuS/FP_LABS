/*
 * HiOrder.scala
 */
/*
 * Напишите ваши решения в виде функций. 
 */
object HigherOrder extends App {
  val plus: (Int, Int) => Int = _ + _
  val multiply: (Int, Int) => Int = _ * _
  /* 
   * Напишите функцию, которая принимает `f: (Int, Int) => Int`, параменты `a` и `b`
   * и коэффициент умножения `n` и возвращает n * f(a, b). Назовите `nTimes`.
   */
  def nTimes(f: (Int, Int) => Int, a: Int, b: Int, n: Int): Int = n * f(a, b)
  /* 
   * Примените вашу функцию (a) здесь, не изменяйте сигнатуру.
   */
  def testNTimes(f: (Int, Int) => Int, a: Int, b: Int, n: Int): Int = nTimes(f, a, b, n)
  /* 
   * Напишите анонимную функцию, функцию без идентификатора ((a, b) => ???) для `nTimes` которая
   * выполняет следующее: if (a > b) a else b
   */
  def testAnonymousNTimes(a: Int, b: Int, n: Int): Int = nTimes((a: Int,b: Int) => { if (a > b) a else b },  a: Int, b: Int, n: Int)

  println("testNTimes:\t" + testNTimes(plus,  10, 20, 30))
  println("testAnonymousNTimes:\t" + testAnonymousNTimes(20, 30, 40))
}