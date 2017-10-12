package exercise.kata

class LastFrame extends Frame{
  
  def isEnding = (rolls.length == 2 && score < MAX_SCORE) || 
                 (rolls.length == 2 && rolls(0).score == MAX_SCORE) ||
                  rolls.length == 3
  
  def maxRollPts = {
    if (rolls.length == 1 && rolls(0).score != MAX_SCORE) MAX_SCORE - score
    else MAX_SCORE
  }
   
  def isSpare = false
  
  def isStrike = false
}