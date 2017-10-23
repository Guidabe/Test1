package walid.aoc.yearone;

import java.io.File;
import java.io.IOException;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import walid.utils.FileUtils;

/**
 * Unit test for simple App.
 */
public class MatchsticksTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public MatchsticksTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( MatchsticksTest.class );
    }
    
    /**
     * Matchsticks Test
     */
    public void test1()
    {
    	Matchsticks m = new Matchsticks();
    	
    	try {
    		File file = FileUtils.getResourceFile("test1.txt");
			assert (m.space(file) == 2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    /**
     * Matchsticks Test
     */
    public void test2()
    {
    	Matchsticks m = new Matchsticks();
    	
    	try {
    		File file = FileUtils.getResourceFile("test2.txt");
    		assert (m.space(file) == 2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    /**
     * Matchsticks Test
     */
    public void test3()
    {
    	Matchsticks m = new Matchsticks();
    	
    	try {
    		File file = FileUtils.getResourceFile("test3.txt");
    		assert (m.space(file) == 3);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    /**
     * Matchsticks Test
     */
    public void test4()
    {
    	Matchsticks m = new Matchsticks();
    	
    	try {
    		File file = FileUtils.getResourceFile("test4.txt");
    		assert (m.space(file) == 5);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    /**
     * Matchsticks Test
     */
    public void test5()
    {
    	Matchsticks m = new Matchsticks();
    	
    	try {
    		File file = FileUtils.getResourceFile("test5.txt");
    		assert (m.space(file) == 12);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    /**
     * Matchsticks Test
     */
    public void test6()
    {
    	Matchsticks m = new Matchsticks();
    	
    	try {
    		File file = FileUtils.getResourceFile("test1.txt");
			assert (m.space2(file) == 4);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    /**
     * Matchsticks Test
     */
    public void test7()
    {
    	Matchsticks m = new Matchsticks();
    	
    	try {
    		File file = FileUtils.getResourceFile("test2.txt");
    		assert (m.space2(file) == 4);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    /**
     * Matchsticks Test
     */
    public void test8()
    {
    	Matchsticks m = new Matchsticks();
    	
    	try {
    		File file = FileUtils.getResourceFile("test3.txt");
    		assert (m.space2(file) == 6);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    /**
     * Matchsticks Test
     */
    public void test9()
    {
    	Matchsticks m = new Matchsticks();
    	
    	try {
    		File file = FileUtils.getResourceFile("test4.txt");
    		assert (m.space2(file) == 5);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    /**
     * Matchsticks Test
     */
    public void test10()
    {
    	Matchsticks m = new Matchsticks();
    	
    	try {
    		File file = FileUtils.getResourceFile("test5.txt");
    		assert (m.space2(file) == 19);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    /**
     * Matchsticks Test
     */
    public void testPart1()
    {
    	Matchsticks m = new Matchsticks();
    	
    	try {
    		File file = FileUtils.getResourceFile("input.txt");
			assert(m.space(file) == 1371);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    /**
     * Matchsticks Test
     */
    public void testPart2()
    {
    	Matchsticks m = new Matchsticks();
    	
    	try {
    		File file = FileUtils.getResourceFile("input.txt");
    		assert(m.space2(file) == 2117);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
