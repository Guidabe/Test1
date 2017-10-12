
/*
 * Todo
 * add InitFrame, LastFrame that extend Frame
 * put frame logic inside its definitions
 * 
 * 
 * */

package exercise.kata

import scala.util.Random

class BowlingGame {
  private val MAX_FRAME = 10
  private val MAX_SCORE = 10
  private val frames = new Array[Frame](MAX_FRAME)
  private var currentFrameId = -1
  
  private def cf = frames(currentFrameId)
  
  def lastFrame = currentFrameId == MAX_FRAME - 1
  
  def fullScore = cf.score == MAX_SCORE
  
  def endOfFrame = {
    
    (!lastFrame &&  (fullScore || cf.nbRolls == 2)) ||
    (lastFrame &&  fullScore && cf.nbRolls == 3) ||
    (lastFrame &&  !fullScore && cf.nbRolls == 2)
  }
  
  def newFrame{
      currentFrameId += 1
      frames(currentFrameId) = new Frame
  }
  
  def score = frames.map(_.finalScore).sum
  
  def run {
    currentFrameId = -1
    newFrame
    
    val rnd = Random
    
    while(currentFrameId < 9 || (lastFrame && !endOfFrame))
    {
      if(endOfFrame)
      {
        val frame = cf
        if(fullScore){
          newFrame
          frame.nextFrame = cf
        }
        else{
          newFrame
        }
      }
      roll(rnd.nextInt(cf.maxRollPts + 1))
    }
    
  }
  
  def roll(i:Int){
      cf.newRoll(i)
  }
  
  override def toString() = {
    "Frames :\n" + frames.zipWithIndex.map{ case (x,i) => "Frame" + i.toString + ": " + x}.mkString("\n")
  }
}