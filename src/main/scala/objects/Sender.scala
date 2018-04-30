package objects

import actors.SenderActor
import akka.actor.{ActorRef, Props}

object Sender {
    def props(message: String, receiverActor: ActorRef): Props = Props(new SenderActor(message, receiverActor))
    final case class WhoToSend(who: String)
    case object Message;
}
