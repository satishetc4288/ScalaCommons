package com.satish.exp

class Stack[T] {

  private var list: List[T] = Nil
  def push(t:T):Unit = { list = t::list}
  def peek():T = {list.head}

  def pop():T = {
    val value = peek()
    list = list.tail
    value
  }
}

object Generics extends App{

  val stack: Stack[Int] = new Stack[Int];
  stack.push(4);
  stack.push(3);
  stack.push(6);
  stack.push(8);

  println(stack.peek());
  println(stack.pop());
  println(stack.pop());

}
