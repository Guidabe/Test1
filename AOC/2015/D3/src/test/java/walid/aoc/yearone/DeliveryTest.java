package walid.aoc.yearone;

import java.io.IOException;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import walid.utils.FileUtils;

/**
 * Unit test for simple App.
 */
public class DeliveryTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public DeliveryTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( DeliveryTest.class );
    }
    
    private String deliveyPath;
    
    @Override
    public void setUp(){

		try {
			deliveyPath = FileUtils.readFileToString("input.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    /**
     * Delivery Test 1
     */
    public void testDelivery1()
    {
		Delivery d = new Delivery(">");
		d.deliver();
		assertTrue( d.nbHouses() == 2 );
    }
    
    /**
     * Delivery Test 2
     */
    public void testDelivery2()
    {
		Delivery d = new Delivery("^>v<");
		d.deliver();
		assertTrue( d.nbHouses() == 4 );
    }
    
    /**
     * Delivery Test 3
     */
    public void testDelivery3()
    {
		Delivery d = new Delivery("^v^v^v^v^v");
		d.deliver();
		assertTrue( d.nbHouses() == 2 );
    }
    
    /**
     * Delivery Input Test
     */
    public void testInputDelivery()
    {
		Delivery d = new Delivery(deliveyPath);
		d.deliver();
		assertTrue( d.nbHouses() == 2081 );
    }
    
    /**
     * Double Delivery Test 1
     */
    public void testDoubleDelivery1()
    {
		Delivery d = new DoubleDelivery("^v");
		d.deliver();
		assertTrue( d.nbHouses() == 3 );
    }
    
    /**
     * Double Delivery Test 2
     */
    public void testDoubleDelivery2()
    {
		Delivery d = new DoubleDelivery("^>v<");
		d.deliver();
		assertTrue( d.nbHouses() == 3 );
    }
    
    /**
     * Double Delivery Test 3
     */
    public void testDoubleDelivery3()
    {
		Delivery d = new DoubleDelivery("^v^v^v^v^v");
		d.deliver();
		assertTrue( d.nbHouses() == 11 );
    }
    
    /**
     * Double Delivery Input Test
     */
    public void testInputDoubleDelivery()
    {
		Delivery d = new DoubleDelivery(deliveyPath);
		d.deliver();
		assertTrue( d.nbHouses() == 2341 );
    }
}
