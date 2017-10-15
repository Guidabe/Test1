package walid.aoc.yearone;

/**
 * Christmas class
 *
 */
public class Christmas
{
	private String directions;
	
	Christmas(String directions){
		this.directions = directions;
	}
	
	public int floor(){
		if (directions.equals("("))
			return 1;
		else if (directions.equals(")"))
			return -1;
		else
			return 0;
	}
}
