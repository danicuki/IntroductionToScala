package com.danicuki.introductiontoscala

import scala.util.Random

object TypeInference {

  def underagePeopleNames(persons: List[Person]) = {
    for (person <- persons; if person.age < 18)
      yield person.name
  }
  def createRandomPeople(): List[Person] = {
    val names = List("Alice", "Bob", "Carol", "Dave", "Eve", "Frank")
    for (name <- names) yield {
      val age = (Random.nextGaussian() * 8 + 20).toInt
      new Person(name, age)
    }
  }
  val people = createRandomPeople()
  //people: List[Person] = List(Alice (16), Bob (16), Carol (19), Dave (18), Eve (26), Frank (11))
  underagePeopleNames(people)
  //res1: List[String] = List(Alice, Bob, Frank)
}