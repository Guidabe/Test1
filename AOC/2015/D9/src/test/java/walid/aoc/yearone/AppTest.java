package walid.aoc.yearone;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

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
     * Permutation Test
     */
    public void testPermutation()
    {
    	String str = "abcde";
    	
    	Character[] charObjectArray = str.chars().mapToObj(c -> (char)c).toArray(Character[]::new);
    	
    	Character[] permuted = new Character[str.length()];
    	
        boolean used[] = {false, false, false, false, false};
    	
    	Permutation<Character> p = new Permutation<Character>();
    	p.permute(0, permuted, used, charObjectArray);
    	
    	String[] strings = new String[p.getPermutations().size()];

    	for (int i=0 ; i< strings.length ; i++){
    		StringBuilder sb = new StringBuilder();
    		for(int j=0 ; j< p.getPermutations().get(i).length ; j++){
    			 sb.append(p.getPermutations().get(i)[j].toString());
    		}
    		strings[i] = sb.toString();
    	}
    	
    	for (int i=0 ; i< strings.length ; i++){
    		System.out.println(strings[i]);
    	}     
    }
}
