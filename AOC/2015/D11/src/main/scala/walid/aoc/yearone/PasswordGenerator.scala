package walid.aoc.yearone

class PasswordGenerator (password:String, rules:List[Requirement]){
    def increment(s:String): String = {
      if (s.isEmpty) ""
      else if (s(s.length - 1) == 'z')increment(s.substring(0, s.length - 1)) + 'a'
      else s.substring(0, s.length - 1) + (s(s.length - 1).toInt+1).toChar
    }
    
    def next : String = {
      var temp : String = increment(password)
      while(!rules.forall(r => r.isConform(temp))){
        temp = increment(temp)
      }   
      temp
    }
}