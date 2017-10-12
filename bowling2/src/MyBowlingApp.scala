import exercise.kata._
import exercise.kata.BowlingGame

object MyBowlingApp extends App {
  val b = new BowlingGame()
  b.run
  println(b + "\nScore = " + b.score)
}