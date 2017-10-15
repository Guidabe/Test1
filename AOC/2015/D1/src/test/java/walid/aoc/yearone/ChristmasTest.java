package walid.aoc.yearone;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class ChristmasTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public ChristmasTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( ChristmasTest.class );
    }
    
    private Christmas c;
    @Override
    public void setUp(){
    	c = new Christmas();
    }

    public void testSteady(){
    	assert (c.floor("") == 0);
    }
    
    public void testUp(){
    	
    	assert (c.floor("(") == 1);
    }

    public void testDown(){
    	assert (c.floor(")") == -1);
    }

    public void testSimpleString(){
    	assert (c.floor("(())") == 0);
    }
    


}
