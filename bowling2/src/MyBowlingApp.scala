import exercise.kata._
import exercise.kata.BowlingGame

object MyBowlingApp extends App {
  val b = new BowlingGame()
  val score = b.score
  println(b + "\nScore = " + score)
}