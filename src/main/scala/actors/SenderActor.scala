package actors

import akka.actor.{Actor, ActorRef}
import objects.Receiver.Print
import objects.Sender.{Message, WhoToSend}

class SenderActor(message: String, receiverActor: ActorRef) extends Actor {

  var receivedMessage = ""

  def receive = {
    case WhoToSend(who) =>
      receivedMessage = s"$message, $who"
    case Message =>
      receiverActor !Print(receivedMessage)
  }
}
