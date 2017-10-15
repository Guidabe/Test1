package walid.aoc.yearone;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

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
    
    private String readFileToString(String filePath)
    	    throws java.io.IOException{

    	ClassLoader classLoader = getClass().getClassLoader();
    	File file = new File(classLoader.getResource(filePath).getFile());

        StringBuffer fileData = new StringBuffer(1000);
        BufferedReader reader = new BufferedReader(
                new FileReader(file));
        char[] buf = new char[1024];

        int numRead=0;
        while((numRead=reader.read(buf)) != -1){
            String readData = String.valueOf(buf, 0, numRead);
            fileData.append(readData);
            buf = new char[1024];
        }

        reader.close();
        return fileData.toString();
    }
    
    @Override
    public void setUp(){
    	c = new Christmas();
    }

    public void testSteadyFloor(){
    	assert (c.floor("") == 0);
    }
    
    public void testUpFloor(){
    	
    	assert (c.floor("(") == 1);
    }

    public void testDownFloor(){
    	assert (c.floor(")") == -1);
    }

    public void testSimpleStringFloor(){
    	assert (c.floor("(())") == 0);
    }
    
    
    public void testInputFloor(){
		try {
			assert (c.floor(readFileToString("input.txt")) == 232);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    


}
