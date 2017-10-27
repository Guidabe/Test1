package walid.aoc.yearone;

import java.io.IOException;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class DinnerTableTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public DinnerTableTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( DinnerTableTest.class );
    }

    /**
     * DinnerTable Test1
     */
    public void testDinnerTable1()
    {
    	try {
			DinnerTable dt = new DinnerTable("test1.txt");
			assert(dt.maxHappiness() == 330);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    /**
     * DinnerTable Test Input - Part one
     */
    public void testDinnerTableInput1()
    {
    	try {
			DinnerTable dt = new DinnerTable("input.txt");
			assert(dt.maxHappiness() == 709);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    /**
     * DinnerTable Test Input - Part two
     */
    public void testDinnerTableInput2()
    {
    	try {
			DinnerTable dt = new DinnerTable("input.txt");
			dt.getPeople().forEach(p -> {
				dt.getHappinessMap().put(new Pair<>(p,"me"), 0);
				dt.getHappinessMap().put(new Pair<>("me", p), 0);
				});
			dt.getPeople().add("me");
			assert(dt.maxHappiness() == 668);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
