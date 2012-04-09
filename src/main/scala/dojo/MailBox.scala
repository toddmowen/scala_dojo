package dojo

class MailBox {

  def handleMsg(msg: PingPongMessage) = msg match{
    case Ping => Pong
    case Pong => Ping
  }

  def receive(msg: Any) = msg match{
    case pingpong: PingPongMessage => handleMsg(pingpong)
    case "stop" => "stopped"
    case ("echo", s: String) => s    // limiting type of s to String is not necessary, but let's be conservative
  }

}
