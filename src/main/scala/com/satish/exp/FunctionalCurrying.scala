package com.satish.exp

object FunctionalCurrying extends App {

  def add(a:Int)(b:Int) = {
    a+b
  }

  val result1 = add(10)_;

  println("functional currying calling with fewer params: " + result1(10))

}
