package com.danicuki.introductiontoscala

import scala.actors.Actor

object Actors {
  class HelloActor extends Actor {
    def act() {
      loop {
        receive {
          case "hello" => println("hello back at you")
          case _ => println("huh?")
        }
      }
    }
  }

  def main(args: Array[String]) {
    val helloActor = new Actors.HelloActor
    helloActor.start

    helloActor ! "hello"
    helloActor ! "buenos dias"
  }
}
