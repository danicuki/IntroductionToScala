package com.danicuki.introductiontoscala

object Immutability {

  def mutable {
    var i = 1
    while (i < 100) {
      println(i)
      i += 1
    }
  }

  def immutable {
    for (i <- Range(1, 100)) yield println(i)
  }

  def main(args: Array[String]) {
    mutable
    immutable
  }
}