
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
  private val Frames = new Array[Frame](MAX_FRAME)
  private var currentFrameId = -1
  
  def lastFrame = currentFrameId == MAX_FRAME - 1
  
  def fullScore = Frames(currentFrameId).score == MAX_SCORE
  
  def endOfFrame = {
    
    (!lastFrame &&  (fullScore || Frames(currentFrameId).nbRolls == 2)) ||
    (lastFrame &&  fullScore && Frames(currentFrameId).nbRolls == 3) ||
    (lastFrame &&  !fullScore && Frames(currentFrameId).nbRolls == 2)
  }
  
  def newFrame{
      currentFrameId += 1
      Frames(currentFrameId) = new Frame
  }
  
  def score = {
    val rnd = Random
    
    currentFrameId = -1
    newFrame
    
    while(currentFrameId < 9 || (lastFrame && !endOfFrame))
    {
      if(endOfFrame)
      {
        val frame = Frames(currentFrameId)
        if(fullScore){
          newFrame
          frame.nextFrame = Frames(currentFrameId)
        }
        else{
          newFrame
        }
        roll(rnd.nextInt(10 + 1))
      }
      else
        roll(rnd.nextInt(Frames(currentFrameId).toGo + 1))
    }
    
    Frames.map(_.finalScore).sum
  }
  
  def roll(i:Int){
      Frames(currentFrameId).newRoll(i)
  }
  
  override def toString() = {
    "Frames :\n" + Frames.zipWithIndex.map{ case (x,i) => "Frame" + i.toString + ": " + x}.mkString("\n")
  }
}