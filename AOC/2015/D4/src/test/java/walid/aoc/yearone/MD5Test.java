package walid.aoc.yearone;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class MD5Test 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public MD5Test( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( MD5Test.class );
    }
    
    /**
     * test MD5 Digest 1
     */
    public void testMD5Digest1()
    {
        MD5Lookup lu = new MD5Lookup("abcdef609043");
        assert (lu.digest().equals("000001DBBFA3A5C83A2D506429C7B00E"));
    }

    /**
     * test MD5 Digest 2
     */
    public void testMD5Digest2()
    {
        MD5Lookup lu = new MD5Lookup("pqrstuv1048970");
        assert (lu.digest().equals("000006136EF2FF3B291C85725F17325C"));
    }

    /**
     * test MD5 Lookup 1
     */
    public void testMD5Lookup1()
    {
        MD5Lookup lu = new MD5Lookup("abcdef");
        assert (lu.find("00000") == 609043);
    }
    
    /**
     * test MD5 Lookup 2
     */
    public void testMD5Lookup2()
    {
        MD5Lookup lu = new MD5Lookup("pqrstuv");
        assert (lu.find("00000") == 1048970);
    }
    
    /**
     * test MD5 Lookup 3
     */
    public void testMD5Lookup3()
    {
        MD5Lookup lu = new MD5Lookup("yzbqklnj");
        assert (lu.find("00000") == 282749);
    }

    /**
     * test MD5 Lookup 4
     */
    public void testMD5Lookup4()
    {
        MD5Lookup lu = new MD5Lookup("yzbqklnj");
        assert (lu.find("000000") == 9962624);
    }
}
