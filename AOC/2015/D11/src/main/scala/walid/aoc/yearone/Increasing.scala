package walid.aoc.yearone

object Increasing extends Requirement{
  override def isConform(s:String) : Boolean = {
    var straight = 1;
    for(i<- 0 until s.length){
      if(straight == 3) return true
      if (i+1 == s.length) return false
      if (s(i+1).toInt == s(i).toInt + 1) straight +=1
      else straight = 1
    }
    return false
  }
  
}