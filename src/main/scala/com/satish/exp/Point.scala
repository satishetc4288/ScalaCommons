package com.satish.exp

class Point(private var _x:Int = 0, private var _y:Int = 0) {

  def x = _x
  def y = _y

  def x_= (newVal:Int) = {
    if (newVal < 100){ _x = newVal}else { warning }
  }

  def y_= (newVal:Int) = {
    if (newVal < 100){ _y = newVal}else { warning }
  }

  private def warning = {
    println("Cant assign this value, less then 100")
  }
}

object Point extends App {
   val point = new Point();
   point.x = 112;
   point.y = 10;
}
