package walid.aoc.yearone;

import java.io.IOException;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import walid.utils.FileUtils;

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
     * test sum 1
     */
    public void test1()
    {
    	String json = "[1,2,3]";
    	JsonApp myApp = new JsonApp(json);
        assertTrue( myApp.sum() == 6 );
    }
    
    /**
     * test sum 2
     */
    public void test2()
    {
    	String json = "{\"a\":2,\"b\":4}";
    	JsonApp myApp = new JsonApp(json);
        assertTrue( myApp.sum() == 6 );
    }
    
    /**
     * test sum 3
     */
    public void test3()
    {
    	String json = "[[[3]]]";
    	JsonApp myApp = new JsonApp(json);
        assertTrue( myApp.sum() == 3 );
    }
    
    /**
     * test sum 4
     */
    public void test4()
    {
    	String json = "{\"a\":{\"b\":4},\"c\":-1}";
    	JsonApp myApp = new JsonApp(json);
        assertTrue( myApp.sum() == 3 );
    }
    
    /**
     * test sum 
     */
    public void test5()
    {
    	String json = "{\"a\":[-1,1]}";
    	JsonApp myApp = new JsonApp(json);
        assertTrue( myApp.sum() == 0 );
    }
    
    /**
     * test sum 6
     */
    public void test6()
    {
    	String json = "[-1,{\"a\":1}]";
    	JsonApp myApp = new JsonApp(json);
        assertTrue( myApp.sum() == 0 );
    }
    
    /**
     * test sum 7
     */
    public void test7()
    {
    	String json = "[]";
    	JsonApp myApp = new JsonApp(json);
        assertTrue( myApp.sum() == 0 );
    }
    
    /**
     * test sum 8
     */
    public void test8()
    {
    	String json = "{}";
    	JsonApp myApp = new JsonApp(json);
        assertTrue( myApp.sum() == 0 );
    }
    
    /**
     * test sum 9
     */
    public void test9()
    {
    	String json;
		try {
			json = FileUtils.readFileToString("input.txt");
	    	JsonApp myApp = new JsonApp(json);
	        assertTrue( myApp.sum() == 191164 );
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    /**
     * test sum 10
     */
    public void test10()
    {
    	String json;
		try {
			json = FileUtils.readFileToString("input.txt");
	    	JsonApp myApp = new JsonApp(json);
	        assertTrue( myApp.sumIgnoreRed() == 87842 );
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
