package com.danicuki.introductiontoscala
import scala.util.Random
import scala.concurrent._
import ExecutionContext.Implicits.global

object ConcurrencyAndDistribution {
  def factorial(n: Int) = (1 to n).foldLeft(BigInt(1))(_ * _)

  def main(args: Array[String]) {
    val x = future { factorial(1000) }
    val y = future { factorial(20000) }
    val z = for (a <- x; b <- y) yield a * b
    for (c <- z) println("Result: " + c)
    println("Meanwhile, the main thread goes on!")
    Thread.sleep(10000)
  }
}