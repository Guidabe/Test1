package walid.aoc.yearone;

import java.io.IOException;
import java.util.Arrays;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class DecisionTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public DecisionTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( DecisionTest.class );
    }
    
    Decision decision = new Decision();
    
    /**
     * SetUp Decision object
     */
    
    @Override
    public void setUp(){
    	try {
			decision.load("input.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    /**
     * VowelsRule Test
     */
    public void testVowelsRule()
    {
    	Rule rule = new VowelsRule();
    	
        assertTrue( rule.isConform("aei") == true);
        assertTrue( rule.isConform("xazegov") == true);
        assertTrue( rule.isConform("aeiouaeiouaeiou") == true);
        assertTrue( rule.isConform("ugknbfddgicrmopn") == true);
        assertTrue( rule.isConform("aaa") == true);
        assertTrue( rule.isConform("jchzalrnumimnmhp") == true);
        assertTrue( rule.isConform("haegwjzuvuyypxyu") == true);
        assertTrue( rule.isConform("dvszwmarrgswjxmb") == false);
    }

    /**
     * DoubleRule Test
     */
    public void testDoubleRule()
    {
    	Rule rule = new DoubleRule();
    	
        assertTrue( rule.isConform("xx") == true);
        assertTrue( rule.isConform("abcdde") == true);
        assertTrue( rule.isConform("aabbccdd") == true);
        assertTrue( rule.isConform("ugknbfddgicrmopn") == true);
        assertTrue( rule.isConform("aaa") == true);
        assertTrue( rule.isConform("jchzalrnumimnmhp") == false);
        assertTrue( rule.isConform("haegwjzuvuyypxyu") == true);
        assertTrue( rule.isConform("dvszwmarrgswjxmb") == true);
    }
    
    /**
     * BannedRule Test
     */
    public void testBannedRule()
    {
    	Rule rule = new BannedRule();
    	
        assertTrue( rule.isConform("ab") == false);
        assertTrue( rule.isConform("cd") == false);
        assertTrue( rule.isConform("pq") == false);
        assertTrue( rule.isConform("xy") == false);
        assertTrue( rule.isConform("ugknbfddgicrmopn") == true);
        assertTrue( rule.isConform("aaa") == true);
        assertTrue( rule.isConform("jchzalrnumimnmhp") == true);
        assertTrue( rule.isConform("haegwjzuvuyypxyu") == false);
        assertTrue( rule.isConform("dvszwmarrgswjxmb") == true);
    }
    
    /**
     * PairTwiceRule Test
     */
    public void testPairTwiceRule()
    {
    	Rule rule = new PairTwiceRule();
    	
        assertTrue( rule.isConform("xyxy") == true);
        assertTrue( rule.isConform("aabcdefgaa") == true);
        assertTrue( rule.isConform("aaa") == false);
        assertTrue( rule.isConform("qjhvhtzxzqqjkmpb") == true);
        assertTrue( rule.isConform("xxyxx") == true);
        assertTrue( rule.isConform("uurcxstgmygtbstg") == true);
        assertTrue( rule.isConform("ieodomkazucvgmuy") == false);
    }
    
    /**
     * RepeatedRule Test
     */
    public void testRepeatedRule()
    {
    	Rule rule = new RepeatedRule();
    	
        assertTrue( rule.isConform("xyx") == true);
        assertTrue( rule.isConform("abcdefeghi") == true);
        assertTrue( rule.isConform("aaa") == true);
        assertTrue( rule.isConform("qjhvhtzxzqqjkmpb") == true);
        assertTrue( rule.isConform("xxyxx") == true);
        assertTrue( rule.isConform("uurcxstgmygtbstg") == false);
        assertTrue( rule.isConform("ieodomkazucvgmuy") == true);
    }
    
    /**
     * Decision Test - Part one
     */
    public void testDecision1()
    {
    	decision.setRules(Arrays.asList(new VowelsRule(), new DoubleRule(), new BannedRule()));
    	
        assertTrue(decision.nbNice() == 255);
    }
    
    /**
     * Decision Test - Part two
     */
    public void testDecision2()
    {
    	decision.setRules(Arrays.asList(new PairTwiceRule(), new RepeatedRule()));
    	
        assertTrue( decision.nbNice() == 55);
    }
}
