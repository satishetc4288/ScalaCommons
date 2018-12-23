package com.satish.exp

class ThreadExp extends Runnable{
  override def run(): Unit = println("running")
}

class ExceptionExample4{
  @throws(classOf[NumberFormatException])
  def validate()={
    "abc".toInt
  }
}

trait Print{
  def print()
}

abstract class PrintA4{
  def printA4()
}

class Printer extends PrintA4{
  def printA4(): Unit = println("printing A4")
  def print(): Unit = println("prinitng simple")
}

object Test{

  def main(args: Array[String]): Unit = {

    val printer = new Printer() with Print;
    printer.print()
    printer.printA4()

    def test() {
      import java.io._
      val fileObject = new File("ScalaFile.text") // Creating a file
      val printWriter = new PrintWriter(fileObject) // Passing reference of file to the printwriter
      printWriter.write("Hello, This is scala file") // Writing to the file
      printWriter.close()

      val thread: Thread = new Thread(new ThreadExp());
      thread.start()
    }
    println(test())

  }

}
