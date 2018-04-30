import akka.actor.{ActorRef, ActorSystem}
import objects.Sender.{Message, WhoToSend}
import objects.{Receiver, Sender}

object MainApp extends App {
  val system : ActorSystem = ActorSystem("MainApp")

  val receiverActor: ActorRef = system.actorOf(Receiver.props, "Receiver")

  val sender1: ActorRef = system.actorOf(Sender.props("Bob", receiverActor),"Sender1")

  sender1 ! WhoToSend("Tom")
  sender1 ! Message
}
