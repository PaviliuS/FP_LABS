/*
 * RecursiveData.scala
 */
import scala.annotation.tailrec
import scala.collection.immutable.List 
/*
 *Напишите свои решения в виде функций. 
 */
object RecursiveData extends App {

  /*
   *Реализуйте функцию, определяющую является ли пустым `List[Int]`.
   */
  def ListIntEmpty(list: List[Int]) : Boolean = list match {
    case x :: tail   => true
    case Nil         => false
  }

  /*
   * Используйте функцию из пункта (a) здесь, не изменяйте сигнатуру.
   */
  def testListIntEmpty(list: List[Int]): Boolean = ListIntEmpty(list)

  /*
   *Реализуйте функцию, которая получает head `List[Int]`или возвращает -1 в случае если он пустой.
   */
  def ListIntHead(list: List[Int]) : Int = list match {
    case x :: tail   => x
    case Nil         => -1
  }

  /*
   *Используйте функцию из пункта (a) здесь, не изменяйте сигнатуру.
   */
  def testListIntHead(list: List[Int]): Int = ListIntHead(list)

  /*
   *Можно ли изменить `List[A]` так чтобы гарантировать что он не является пустым?
   */
  def ListNotEmpty[A](head: A, list: List[A]) : List[A] = list match {
    case Nil          => head :: list
    case x :: tail    => list
  }

  println("ListNotEmpty(Nil): \t" + ListNotEmpty(1, Nil))
  println("ListNotEmpty(List(1, 2, 3): \t" + ListNotEmpty(1, List(1, 2, 3)))
  println("ListIntHead(List(1, 2, 3): \t" + testListIntHead(List(1, 2, 3)))
}