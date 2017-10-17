package walid.aoc.yearone;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class Elves 
{
	private List<Present> presents = new ArrayList<Present>();
	
	public void addPresent(String s){
		presents.add(new Present(s));
	}
	
    public long wrappingPaper()
    {
    	return presents.stream().mapToLong(b -> b.paper()).sum();
    }
    
    public long ribbon()
    {
    	return presents.stream().mapToLong(b -> b.ribbon()).sum();
    }
}
