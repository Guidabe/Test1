package walid.aoc.yearone

object Banned extends Requirement{
  override def isConform(s:String)= !s.matches(".*[iol].*");
  
}