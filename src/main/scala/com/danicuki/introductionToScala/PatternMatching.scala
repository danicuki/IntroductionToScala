package com.danicuki.introductiontoscala

object PatternMatching {

  def extract = {
    val tup = ("hello world", 42)
    tup match {
      case (s, i) =>
        println("the string was " + s)
        println("the number was " + i)
    }
    val p = Person("John Doe", 42)
    p match {
      case Person(name, 42) =>
        //only extracting the name here, the match would fail if the age wasn't 42
        println(name)
    }
  }

  def valueAssignment {
    val tup = (19, 73)

    val (a, b) = tup

    //    for ((a, b) <- tup) yield a + b
  }

  def checkCases {
    val tup = (19, 73)

    val result = tup match {
      case (a, b) => a + b
      case (19, a) => a
    }
  }

}