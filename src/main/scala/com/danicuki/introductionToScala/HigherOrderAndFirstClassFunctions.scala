import com.danicuki.introductionToScala.Person

object HigherOrderAndFirstClassFunctions {

  def add(i: Int, j: Int) = i + j

  def powerTwo(x: Int => Int)(y: Int): Int = x(y) * x(y)

  def addTen = add(_: Int, 10)

  def addTenpowerTwo(x: Int): Int = powerTwo(addTen)(x)

  val myFunc = PartialFunction(addTenpowerTwo)

  val people = List(Person("Daniel", 34), Person("Matusalém", 912))
  val (minors, adults) = people partition (_.age < 150)

  val root: PartialFunction[Double, Double] = {
    case d if (d >= 0) => math.sqrt(d)
  }

  root(3)
  //Double = 1.7320508075688772
  List(0.5, -0.2, 4).collect(root)
  //List[Double] = List(0.7071067811865476, 2.0)
}

object IntroductionToFunctionalProgrammingWithScala {
  val myName = "Daniel Cukier"
  val twitter = "@danicuki"
  val email = "danicuki@ime.usp.br"
  def main(args: Array[String]) {
    println("Hello Campus Party!")
    println(HigherOrderAndFirstClassFunctions.myFunc(20))
  }
}