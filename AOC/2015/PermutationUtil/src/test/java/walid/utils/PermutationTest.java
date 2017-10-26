package walid.utils;

import java.util.ArrayList;
import java.util.List;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class PermutationTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public PermutationTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( PermutationTest.class );
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
    	
    	Permutations<Character> p = new Permutations<Character>(charObjectArray);
    	p.permute(0, permuted, used);
    	
    	List<String> strings = new ArrayList<String>();
    	int length = p.getPermutations().size();

    	for (int i=0 ; i< length ; i++){
    		StringBuilder sb = new StringBuilder();
    		for(int j=0 ; j< p.getPermutations().get(i).length ; j++){
    			 sb.append(p.getPermutations().get(i)[j].toString());
    		}
    		strings.add(sb.toString());
    	}

    	//strings.forEach(s -> System.out.println(s));
    	
    	assert (strings.contains("abcde"));
    	assert (strings.contains("edcba"));
    	assert (strings.contains("abdec"));
    }
}
