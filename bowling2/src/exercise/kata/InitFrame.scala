package exercise.kata

class InitFrame extends Frame{
  
  def isEnding = rolls.length == 2 || score == MAX_SCORE
  
  def maxRollPts = MAX_SCORE - score
   
  def isSpare = score == MAX_SCORE && rolls.length == 2
  
  def isStrike = score == MAX_SCORE && rolls.length == 1
}