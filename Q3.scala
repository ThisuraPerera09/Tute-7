package Tute7

object Q3 extends App {
  val acc1 = new Account(1, 45.5);
  val acc2 = new Account(2, 20);

  println(acc1);
  println(acc2);

  acc1.transfer(acc2, 25.5);

  println(acc1);
  println(acc2);

}
