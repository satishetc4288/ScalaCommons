package com.satish.exp

abstract class Notifications

case class Email(sender:String, message:String, subject:String) extends Notifications

case class SMS(message:String, sender:Long) extends Notifications

object CaseClass extends App {

  def readNotifications(notifications: Notifications) = notifications match {

    case Email(sender, message, subject) => s"Received email from $sender, with subject: $subject, with body: $message"

    case SMS(message, sender) => s"Received SMS from $sender, with body: $message"

    case _ => "Unknown notications"
  }

  val notifications = readNotifications(Email("satish.sonu@gmail.com", "hi how are you sirjee", "greeting"))

  println(notifications);
}
