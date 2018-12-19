package com.satish.exp

object ScalaTuples extends App {

  //val tuple2: Tuple2[String, Int] = ("satish", 30);
  //OR   val tuple2 = ("satish", 30);
  //println("val 1: " + tuple2._1 + ", val 2: " + tuple2._2)


  val planetDistanceFromSun = List(("Mercury", 57.9), ("Venus", 108.2), ("Earth", 149.6 ), ("Mars", 227.9), ("Jupiter", 778.3))

  planetDistanceFromSun.foreach{ tuple => {

    tuple match {

      case ("Mercury", distance) => println(s"Mercury is $distance millions km far from Sun")

      case p if(p._1 == "Venus") => println(s"Venus is ${p._2} millions km far from Sun")

      case p if(p._1 == "Earth") => println(s"Blue planet is ${p._2} millions km far from Sun")

      case _ => println("Too far....")

    }

  }

  }

}
