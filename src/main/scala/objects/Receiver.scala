package objects

import actors.ReceiverActor
import akka.actor.Props

object Receiver {
  def props :Props = Props[ReceiverActor]
  final case class Print(message: String)
}
