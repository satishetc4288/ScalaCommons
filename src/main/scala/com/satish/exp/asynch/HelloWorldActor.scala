package com.satish.exp.asynch

import akka.actor.{Actor, ActorSystem, Props}

class HelloWorld extends Actor{
  override def receive: Receive = {
    case message:String => println( sender() + " shas sent you a message: " + message )
    case _ => println("received unknown message")
  }

  override def preStart(): Unit = {
    println("pre start call")
  }
}

object HelloWorldActor extends App {

  val actorSystem = ActorSystem("actorSystem")
  val actor = actorSystem.actorOf(Props[HelloWorld], "HellowWorldActor")
  actor.tell("Hello World !", null)
  actor ! 134

  actorSystem.stop(actor)
  System.exit(1);

}
