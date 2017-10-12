package exercise.kata

class LastFrame extends Frame{
  
  def isEnding = (rolls.length == 2 && score < 10) || rolls.length == 3
  
  def maxRollPts = if (rolls.length <=1) MAX_SCORE - score else MAX_SCORE
}