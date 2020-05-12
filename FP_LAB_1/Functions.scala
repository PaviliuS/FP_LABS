/*
 * Functions.scala
 */
/* 
 * Напишите отдельные функции, решающие поставленную задачу. 
 * 
 * Синтаксис:
 * // метод
 * def myFunction(param0: Int, param1: String): Double = // тело
 * 
 * // значение
 * val myFunction: (Int, String) => Double (param0, param1) => // тело
 */
object Functions extends App {
  /* 
   * Напишите функцию, которая рассчитывает площадь окружности r^2 * Math.PI
   */
  def CircleArea(r: Double): Double = r * r * Math.PI
  /*  
   * Примените вашу функцию из пункта здесь, не изменяя сигнатуру.
  */
  def testCircle(r: Double): Double = CircleArea(r)

  /* 
   * Напишите карированную функцию которая рассчитывает площадь прямоугольника a * b.
   */
  def RectangeAreaCur(a: Double)(b:Double) = a * b 
   /* 
   * Примените вашу функцию из пукта здесь, не изменяя сигнатуру.
   */
  def testRectangleCur(a: Double, b: Double): Double = RectangeAreaCur(a)(b)
  
  /* 
   * Напишите не карированную функцию для расчета площади прямоугольника.
   */
  def RectangleArea(a: Double, b:Double): Double = a * b
  /* 
   * Примените вашу функцию из пункта здесь, не изменяя сигнатуру.
   */
  def testRectangleUc(a: Double, b: Double): Double = RectangleArea(a, b)

  println("testCircle:\t\t" + testCircle(31))
  println("testRectangleCur:\t" + testRectangleCur(10, 10))
  println("testRectangleUc:\t" + testRectangleUc(10, 10))
}