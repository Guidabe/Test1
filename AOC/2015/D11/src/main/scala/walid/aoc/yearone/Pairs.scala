package walid.aoc.yearone

object Pairs extends Requirement{
  override def isConform(s:String)= s.matches(".*([a-z])\\1.*([a-z])\\2.*")
  
}