package walid.aoc.yearone;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import walid.utils.FileUtils;

/**
 * Unit test for simple App.
 */
public class ReindeerTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public ReindeerTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( ReindeerTest.class );
    }
    
    /*
     * 
     * Set up
     */
    @Override
    public void setUp() throws IOException{
    	File file = FileUtils.getResourceFile("input.txt");
    	try(BufferedReader buf = new BufferedReader(new FileReader(file))){
    		String line;
    		while((line= buf.readLine()) != null){
    			String[] tokens = line.split(" ");
    			if (tokens.length == 15){
    				Race.getReindeers().add(new Reindeer(Integer.parseInt(tokens[3]), 
    						Integer.parseInt(tokens[6]), 
    						Integer.parseInt(tokens[13])));
    				}
    			}
    		}
    }

    public void testDistance()
    {
    	Reindeer comet = new Reindeer(14, 10, 127);
    	Reindeer dancer = new Reindeer(16, 11, 162);
        assertTrue( comet.distance(1) == 14);
        assertTrue( dancer.distance(1) == 16);
        assertTrue( comet.distance(10) == 140);
        assertTrue( dancer.distance(10) == 160);
        assertTrue( comet.distance(11) == 140);
        assertTrue( dancer.distance(11) == 176);
        assertTrue( comet.distance(12) == 140);
        assertTrue( dancer.distance(12) == 176);
        assertTrue( comet.distance(1000) == 1120);
        assertTrue( dancer.distance(1000) == 1056);
    }
    
    public void testMaxDistance(){ 	
    	assertTrue(Race.maxDistance(2503) == 2660);
    }
    
    public void testMaxPoints(){
    	assertTrue(Race.maxPoints(2503) == 1256);
    }
}
