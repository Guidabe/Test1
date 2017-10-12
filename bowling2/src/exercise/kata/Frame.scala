package exercise.kata

abstract class Frame {
  
  protected val MAX_SCORE = 10
  
  protected var rolls = Vector.empty[Roll]
  
  var nextFrame : Frame = null
  
  def score = rolls.map(_.score).sum
   
  def newRoll(i:Int) { rolls = rolls :+ new Roll(i) }
  
  override def toString() = rolls.mkString(",")
  
  def isBeginning = rolls.isEmpty
  
  def isEnding : Boolean
  
  def maxRollPts : Int
  
  def isSpare = score == 10 && rolls.length == 2
  
  def spareBonus = {
    if (rolls.isEmpty) 
      throw new Exception("no rolls for spareBonus")
    rolls(0).score
  }
  
  def strikeBonus = {
    if (rolls.isEmpty) 
      throw new Exception("no rolls for strikeBonus")

    if(rolls.length >= 2)
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