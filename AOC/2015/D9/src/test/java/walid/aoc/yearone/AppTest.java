package walid.aoc.yearone;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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

    /**
     * SymetricPair Test
     */
    public void testSymetricPair()
    {
    	SymetricPair<String> pair1 = new SymetricPair<String>("abc", "cde");
    	SymetricPair<String> pair2 = new SymetricPair<String>("abc", "cde");
    	SymetricPair<String> pair3 = new SymetricPair<String>("cde", "abc");
    	SymetricPair<String> pair4 = new SymetricPair<String>("abc", "cdef");
    	
    	assert(pair1.equals(pair2));
    	assert(pair1.equals(pair3));
    	assert(!pair1.equals(pair4));
    }
    

    /**
     * Min Distance Test
     */
    public void testMinDistance()
    {
    	App app = new App();
    	try {
			app.loadConfiguration("input.txt");
			assert(app.minDistance() == 207);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    }
    
    /**
     * Max Distance Test
     */
    public void testMaxDistance()
    {
    	App app = new App();
    	try {
			app.loadConfiguration("input.txt");
			assert(app.maxDistance() == 804);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    }
}
