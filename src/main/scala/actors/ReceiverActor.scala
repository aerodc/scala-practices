package actors

import akka.actor.{Actor, ActorLogging}
import objects.Receiver.Print

class ReceiverActor extends Actor with ActorLogging{
   def receive = {
     case Print(message) => log.info(s"Message received (from ${sender()}): $message")
   }
}
