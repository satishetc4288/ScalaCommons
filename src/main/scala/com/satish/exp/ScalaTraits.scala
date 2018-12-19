package com.satish.exp

import scala.collection.mutable.ArrayBuffer

trait Pet[T] { val name: T }
class Dog(val name:String) extends Pet[String]
class Cat(val name:String) extends Pet[String]

object ScalaTraits extends App {

 val list = ArrayBuffer.empty[Pet[String]]
  list.append(new Dog("kallu"));
  list.append(new Cat("miyaun"));

  list.foreach( elem => {
    println(elem.name);
  })

}
