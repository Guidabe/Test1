package exercise.kata

class InitFrame extends Frame{
  
  def isEnding = rolls.length == 2 || score == 10
  
  def maxRollPts = MAX_SCORE - score
}