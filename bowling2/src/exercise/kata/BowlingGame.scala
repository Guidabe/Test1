
/*
 * Todo
 * Add Strike and Spare classes
 * 
 * 
 * */

package exercise.kata

import scala.util.Random

class BowlingGame {
  private val MAX_FRAME = 10
  
  private val frames : Array[Frame] = Array.tabulate(MAX_FRAME)(
      i => if (i == MAX_FRAME - 1) new LastFrame else new InitFrame)
      
  private var currentFrameId = 0
  
  private def cf = frames(currentFrameId)
  
  def score = frames.map(_.finalScore).sum
  
  def run {
    currentFrameId = 0
    var prec : Frame = null
    
    val r = Random
    while(currentFrameId < MAX_FRAME)
    {
      if(cf.isBeginning){
        if(prec != null) prec.nextFrame = cf
        roll(r.nextInt(cf.maxRollPts + 1))
      }
      else if(cf.isEnding){
        prec = cf
        currentFrameId += 1     
      }
      else
        roll(r.nextInt(cf.maxRollPts + 1))
    }
    
  }
  
  def roll(i:Int){
      cf.newRoll(i)
  }
  
  override def toString() = {
    "Frames :\n" + frames.zipWithIndex.map{ case (x,i) => "Frame" + i.toString + ": " + x}.mkString("\n")
  }
}