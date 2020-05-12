/*
 * Compositions.scala 
 */
/*
 * Option представляет собой контейнер, который хранит какое-то значение 
 * или не хранит ничего совсем, указывает, вернула ли операция результат или нет. 
 * Это часто используется при поиске значений или когда операции могут потерпеть неудачу, 
 * и вам не важна причина.
 *
 * Комбинаторы называются так потому, что они созданы, чтобы объединять результаты. 
 * Результат одной функции часто используется в качестве входных данных для другой.
 * Наиболее распространенным способом, является использование их со стандартными структурами данных.
 * Функциональные комбинаторы `map` и` flatMap` являются контекстно-зависимыми.
 * map - применяет функцию к каждому элементу из списка, возвращается список с тем же числом элементов.
 * flatMap берет функцию, которая работает с вложенными списками и объединяет результаты.
 */
/* 
 * Напишите ваши решения в тестовых функциях. 
 */
object Compositions extends App{

  /*
   * Используйте данные функции. Вы можете реализовать свое решение прямо в тестовой функции.
   * Нельзя менять сигнатуры
   */
  def testCompose[A, B, C, D](f: A => B)
                             (g: B => C)
                             (h: C => D): A => D = h compose g compose f

  /*
   * Напишите функции с использованием `map` и `flatMap`. Вы можете реализовать свое решение прямо в тестовой функции.
   * Нельзя менять сигнатуры
   */
  def testMapFlatMap[A, B, C, D](f: A => Option[B])
                                (g: B => Option[C])
                                (h: C => D): Option[A] => Option[D] = _.flatMap(f).flatMap(g).map(h)
  /*
   * Напишите функцию используя for. Вы можете реализовать свое решение прямо в тестовой функции.
   * Нельзя менять сигнатуры
   */
  def testForComprehension[A, B, C, D](f: A => Option[B])
                                      (g: B => Option[C])
                                      (h: C => D): Option[A] => Option[D] = for { first <- _
                                                                                  second <- f(first)
                                                                                  third <- g(second) } yield h(third)
  
  println(testCompose((i:Int) => "Compose" * i)((i: String) => i * 2)((i:String) => i.dropRight(3))(2))

  println(testMapFlatMap((i:Int) => if (i > 0) Some(i) else None)
  ((i:Int) => if (i > 10) Some(i) else None)
  ((i:Int) => i * 2)(Some(-1)))

  println(testForComprehension((i:Int) => if (i > 0) Some(i) else None)
  ((i:Int) => if (i > 10) Some(i) else None)
  ((i:Int) => i * 2)(Some(11)))
}