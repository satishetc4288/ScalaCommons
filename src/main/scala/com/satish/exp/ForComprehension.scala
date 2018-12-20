package com.satish.exp


object ForComprehension extends App{

  case class User(name:String, age:Int)
  val userList = List(
    User("satish", 30),
    User("nikhil", 27),
    User("pintu", 31)
  )
  /*Here (user <- userList) is enumerator and if block is filter. */
  val filteredList = for (user <- userList if(user.age < 31 && user.age > 26)) yield user.name
  filteredList.foreach( name => println(name))

  def foo(n: Int, v: Int) =
    for (i <- 0 until n;
         j <- i until n if i + j == v)
      yield (i, j)

  foo(10, 10) foreach {
    case (i, j) =>
      print(s"($i, $j) ")  // prints (1, 9) (2, 8) (3, 7) (4, 6) (5, 5)
  }

}
