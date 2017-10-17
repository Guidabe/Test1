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
public class ElvesTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public ElvesTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( ElvesTest.class );
    }

    /**
     * test wrapping paper
     * @throws IOException 
     */
    public void testWrappingPaper1() throws IOException
    {
        assert(new Present("1x1x1").paper() == 7);
    }

    /**
     * test wrapping paper
     * @throws IOException 
     */
    public void testWrappingPaper2() throws IOException
    {
        assert(new Present("1x2x3").paper() == 24);
    }

    /**
     * test wrapping paper
     * @throws IOException 
     */
    public void testWrappingPaper3() throws IOException
    {
        assert(new Present("3x1x2").paper() == 24);
    }

    /**
     * test wrapping paper
     * @throws IOException 
     */
    public void testWrappingPaper4() throws IOException
    {
        assert(new Present("9x12x5").paper() == 471);
    }

    /**
     * test wrapping paper
     * @throws IOException 
     */
    public void testWrappingPaper5() throws IOException
    {
        assert(new Present("15x23x7").paper() == 1327);
    }
    
    /**
     * test wrapping paper
     * @throws IOException 
     */
    public void testWrappingPaper6() throws IOException
    {
        File f = FileUtils.getResourceFile("test1.txt");
        try (BufferedReader buf = new BufferedReader(new FileReader(f))){
        	
	        Elves wp = new Elves();
	        
	        String line;
	        while ((line = buf.readLine()) != null ){
	        	wp.addPresent(line);
	        }
	        
	        assert(wp.wrappingPaper() == 1327 + 471 + 24);
        }       
    }

    /**
     * test wrapping paper
     * @throws IOException 
     */
    public void testWrappingPaper7() throws IOException
    {
        File f = FileUtils.getResourceFile("input.txt");
        try (BufferedReader buf = new BufferedReader(new FileReader(f))){
        	
	        Elves wp = new Elves();
	        
	        String line;
	        while ((line = buf.readLine()) != null ){
	        	wp.addPresent(line);
	        }
	        
	        assert(wp.wrappingPaper() == 1598415);
        }     
    }

    /**
     * test wrapping paper
     * @throws IOException 
     */
    public void testRibbon1() throws IOException
    {
        assert(new Present("1x1x1").ribbon() == 5);
    }

    /**
     * test wrapping paper
     * @throws IOException 
     */
    public void testRibbon2() throws IOException
    {
        assert(new Present("1x2x3").ribbon() == 12);
    }

    /**
     * test wrapping paper
     * @throws IOException 
     */
    public void testRibbon3() throws IOException
    {
        assert(new Present("3x1x2").ribbon() == 12);
    }

    /**
     * test wrapping paper
     * @throws IOException 
     */
    public void testRibbon4() throws IOException
    {
        assert(new Present("9x12x5").ribbon() == 568);
    }

    /**
     * test wrapping paper
     * @throws IOException 
     */
    public void testRibbon5() throws IOException
    {
        assert(new Present("15x23x7").ribbon() == 2459);
    }
    
    /**
     * test wrapping paper
     * @throws IOException 
     */
    public void testRibbon16() throws IOException
    {
        File f = FileUtils.getResourceFile("test1.txt");
        try (BufferedReader buf = new BufferedReader(new FileReader(f))){
        	
	        Elves wp = new Elves();
	        
	        String line;
	        while ((line = buf.readLine()) != null ){
	        	wp.addPresent(line);
	        }
	        
	        assert(wp.ribbon() == 2459 + 568 + 12);
        }       
    }

    /**
     * test wrapping paper
     * @throws IOException 
     */
    public void testRibbon7() throws IOException
    {
        File f = FileUtils.getResourceFile("input.txt");
        try (BufferedReader buf = new BufferedReader(new FileReader(f))){
        	
	        Elves wp = new Elves();
	        
	        String line;
	        while ((line = buf.readLine()) != null ){
	        	wp.addPresent(line);
	        }
	        System.out.println(wp.ribbon());
	        assert(wp.ribbon() == 3812909);
        }     
    }
}
