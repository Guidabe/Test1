package walid.aoc.yearone;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Look and say Test
     */
    public void test1()
    {
    	assert(LookAndSay.say("1").equals("11"));
    	assert(LookAndSay.say("11").equals("21"));
    	assert(LookAndSay.say("21").equals("1211"));
    	assert(LookAndSay.say("1211").equals("111221"));
    	assert(LookAndSay.say("111221").equals("312211"));
    }
    

    /**
     * Look and say Test
     */
    public void testInput()
    {
    	String output = "1321131112";
    	
    	for(int i=0; i< 40 ; i++){
    		output = LookAndSay.say(output);
    	}
    	
    	assert(output.length() == 492982);
    }
}
