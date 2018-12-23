package com.satish.exp

object Util {

  def commentOnMarks(marks:Int) = {
    if(marks > 10){
      "passed exam"
    }else{
      "failed in exam"
    }
  }
}

object ExpObject extends App {

  def forLoopDemo = {
    var list = for(i <- 1 to 10 if i%2 == 0) yield i
    for (i <- list){
      println(i)
    }
  }
  forLoopDemo

  def higherOrderF(marks:Int, f:Int => String) = {
    println("marks received: " + marks)
    println("comments received: " + f(marks))
  }
  higherOrderF(12, Util.commentOnMarks);

}
