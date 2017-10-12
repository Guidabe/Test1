package exercise.kata

class Frame {
  private var rolls = Vector.empty[Roll]
  
  var nextFrame : Frame = null
  
  def nbRolls = rolls.length
  
  def maxRollPts = 10 - score
  
  def score = rolls.map(_.score).sum
   
  def newRoll(i:Int) { rolls = rolls :+ new Roll(i) }
  
  override def toString() = rolls.mkString(",")
  
  def isSpare = score == 10 && nbRolls == 2
  
  def spareBonus = {
    if (rolls.isEmpty) 
      throw new Exception("no rolls for spareBonus")
    rolls(0).score
  }
  
  def strikeBonus = {
    if (rolls.isEmpty) 
      throw new Exception("no rolls for strikeBonus")

    if(nbRolls >= 2)
      rolls(0).score + rolls(1).score
    else
      rolls(0).score + nextFrame.spareBonus
  }
  
  def finalScore = { score +
    (if(score == 10 && nextFrame != null) {
      if(isSpare){
        nextFrame.spareBonus
      }
      else
        nextFrame.strikeBonus
    }
    else
      0)
  }
}