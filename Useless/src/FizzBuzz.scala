object FizzBuzz extends App {

  def create(end: Int) = {
    for (i <- 1 to end) yield {
      if (i % 15 == 0) "FizzBuzz"
      else if (i % 3 == 0) "Fizz"
      else if (i % 5 == 0) "Buzz"
      else i.toString
    }
  }

  println(create(30).mkString(", "))
}