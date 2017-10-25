package walid.aoc.yearone

import org.junit._
import Assert._

@Test
class PasswordGeneratorTest {

    @Test
    def testIncreasingRequirement {
      assertTrue(Increasing.isConform("abcd"))
      assertTrue(Increasing.isConform("abdef"))
      assertFalse(Increasing.isConform("ab"))
      assertFalse(Increasing.isConform("abd"))
      assertTrue(Increasing.isConform("hijklmmn"))
      assertFalse(Increasing.isConform("abbceffg"))
      assertFalse(Increasing.isConform("abbcegjk"))
      assertTrue(Increasing.isConform("abcdffaa"))
      assertTrue(Increasing.isConform("ghjaabcc"))
    }
    
    
    @Test
    def testBannedRequirement {
      assertFalse(Banned.isConform("hijklmmn"))
      assertTrue(Banned.isConform("abbceffg"))
      assertTrue(Banned.isConform("abbcegjk"))
      assertTrue(Banned.isConform("abcdffaa"))
      assertTrue(Banned.isConform("ghjaabcc"))
    }
    
    
    @Test
    def testPairsRequirement {
      assertFalse(Pairs.isConform("hijklmmn"))
      assertTrue(Pairs.isConform("abbceffg"))
      assertFalse(Pairs.isConform("abbcegjk"))
      assertTrue(Pairs.isConform("abcdffaa"))
      assertTrue(Pairs.isConform("ghjaabcc"))
    }

    @Test
    def testPasswordGeneratorIncrement {
      assertTrue(new PasswordGenerator("",null).increment("abcd") == "abce")
      assertTrue(new PasswordGenerator("",null).increment("") == "")   
      assertTrue(new PasswordGenerator("",null).increment("abfz") == "abga")
      assertTrue(new PasswordGenerator("",null).increment("abzz") == "acaa")     
    }
    
    @Test
    def testPasswordGeneratorNext {
      assertTrue(new PasswordGenerator("abcdefgh", List(Banned, Increasing, Pairs)).next == "abcdffaa")
      assertTrue(new PasswordGenerator("ghijklmn", List(Banned, Increasing, Pairs)).next == "ghjaabcc")    
      assertTrue(new PasswordGenerator("hepxcrrq", List(Banned, Increasing, Pairs)).next == "hepxxyzz")  
      assertTrue(new PasswordGenerator("hepxxyzz", List(Banned, Increasing, Pairs)).next == "heqaabcc")
    }

}


