package exercise.kata

object BonusFactory {
  def getBonus(f:Frame) : Bonus = {
    if (f.isSpare) new Spare(f)
    else if (f.isStrike) new Strike(f)
    else new Bonus
  }
}