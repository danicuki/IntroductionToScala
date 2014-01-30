package com.danicuki.introductiontoscala

case class Person(val name: String, val age: Int) {
  override def toString = s"$name ($age)"
}