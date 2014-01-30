package com.danicuki.introductiontoscala

object LessCode {

  def fact1(n: Int) = {
    var i = n
    var result = 1
    while (i > 1) {
      result = result * i
      i -= 1
    }
    result
  }

  def fact2(n: Int) = (1 to n).foldLeft(BigInt(1))(_ * _)

  def fact3(n: Int): Int =
    if (n == 1) 1 else n * fact3(n - 1)

  def main(args: Array[String]) {
    println(fact1(10))
    println(fact2(100000))
    println(fact3(10))
  }
}