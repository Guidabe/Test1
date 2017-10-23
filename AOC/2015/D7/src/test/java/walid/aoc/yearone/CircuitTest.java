package walid.aoc.yearone;

import java.io.IOException;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class CircuitTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public CircuitTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( CircuitTest.class );
    }

    /**
     * Circuit Test
     */
    public void test1()
    {
    	Circuit c = new Circuit();
    	
    	try {
			c.loadConfiguration("test1.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        assertTrue( c.getSignal("x") == 123 );
    }

    /**
     * Circuit Test
     */
    public void test2()
    {
    	Circuit c = new Circuit();
    	
    	try {
			c.loadConfiguration("test2.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        assertTrue( c.getSignal("x") == 123 );
        assertTrue( c.getSignal("y") == 456);
    }

    /**
     * Circuit Test
     */
    public void test3()
    {
    	Circuit c = new Circuit();
    	
    	try {
			c.loadConfiguration("test3.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        assertTrue( c.getSignal("x") == 123 );
        assertTrue( c.getSignal("y") == 456);
        assertTrue( c.getSignal("d") == 72 );
    }
    

    /**
     * Circuit Test
     */
    public void test4()
    {
    	Circuit c = new Circuit();
    	
    	try {
			c.loadConfiguration("test4.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        assertTrue( c.getSignal("x") == 123 );
        assertTrue( c.getSignal("y") == 456);
        assertTrue( c.getSignal("d") == 72 );
        assertTrue( c.getSignal("e") == 507 );
        assertTrue( c.getSignal("f") == 492);
        assertTrue( c.getSignal("g") == 114 );
        assertTrue( c.getSignal("h") == 65412 );
        assertTrue( c.getSignal("i") == 65079 );
    }

    /**
     * Circuit Test
     */
    public void test5()
    {
    	Circuit c = new Circuit();
    	
    	try {
			c.loadConfiguration("test5.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
        assertTrue( c.getSignal("x") == 123 );
        assertTrue( c.getSignal("y") == 456);
        assertTrue( c.getSignal("d") == 72 );
        assertTrue( c.getSignal("e") == 507 );
        assertTrue( c.getSignal("f") == 492);
        assertTrue( c.getSignal("g") == 114 );
        assertTrue( c.getSignal("h") == 65412 );
        assertTrue( c.getSignal("i") == 65079 );
    }
    /**
     * Circuit Test
     */
    public void testApp()
    {
    	Circuit c = new Circuit();
    	
    	try {
			c.loadConfiguration("input.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
        assertTrue( c.getSignal("a") == 46065 );
    }
}
