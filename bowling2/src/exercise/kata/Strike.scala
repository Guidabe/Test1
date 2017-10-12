package exercise.kata

class Strike(f:Frame) extends Bonus {
  override def bonus = {
    f.nextFrame.getRollPts(0) + (
        if (f.nextFrame.getNbRolls >=2) f.nextFrame.getRollPts(1)
        else f.nextFrame.nextFrame.getRollPts(0))
  }
}