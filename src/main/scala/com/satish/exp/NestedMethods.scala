package com.satish.exp

object NestedMethods extends App {

   def parantMethod(x: Int): Int = {
     def childMethod(y: Int): Int = {
       12 * y
     }
     childMethod(x);
   }
  println(parantMethod(12))

}
