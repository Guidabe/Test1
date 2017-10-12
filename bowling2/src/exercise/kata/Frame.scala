package exercise.kata

abstract class Frame {
  
  protected val MAX_SCORE = 10
  
  protected var rolls = Vector.empty[Roll]
  
  def isEnding : Boolean
  
  def maxRollPts : Int
   
  def isSpare : Boolean
  
  def isStrike : Boolean
  
  var nextFrame : Frame = null
  
  var bonus = new Bonus
  
  def score = rolls.map(_.score).sum
   
  def newRoll(pts:Int) { rolls = rolls :+ new Roll(pts) }
  
  def getRollPts(i:Int) = rolls(i).score
  
  def getNbRolls = rolls.length
  
  override def toString() = rolls.mkString(",")
  
  def isBeginning = rolls.isEmpty
  
  def finalScore = score + bonus.bonus
}