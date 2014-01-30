package com.danicuki.introductiontoscala

object QuickSort {
  def sort(list: List[Int]): List[Int] = {
    list match {
      case Nil => list
      case _ => sort(list.tail.filter(_ <= list.head)) :::
        list.head ::
        sort(list.tail.filter(_ > list.head))
    }
  }
}
