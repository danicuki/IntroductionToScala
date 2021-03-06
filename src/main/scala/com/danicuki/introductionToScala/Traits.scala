package com.danicuki.introductiontoscala

object Traits {
  abstract class Spacecraft {
    def engage(): Unit
  }

  trait CommandoBridge extends Spacecraft {
    def engage(): Unit = {
      for (_ <- 1 to 3)
        speedUp()
    }
    def speedUp(): Unit
  }

  trait PulseEngine extends Spacecraft {
    val maxPulse: Int
    var currentPulse: Int = 0
    def speedUp(): Unit = {
      if (currentPulse < maxPulse)
        currentPulse += 1
    }
  }
  class StarCruiser extends Spacecraft
    with CommandoBridge
    with PulseEngine {
    val maxPulse = 200
  }
}