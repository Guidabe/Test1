package exercise.kata

class Spare(f:Frame) extends Bonus {
  override def bonus = {
    f.nextFrame.getRollPts(0)
  }
}