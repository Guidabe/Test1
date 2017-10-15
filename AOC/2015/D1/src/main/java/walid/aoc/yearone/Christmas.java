package walid.aoc.yearone;

/**
 * Christmas class
 *
 */
public class Christmas
{
	public int floor(String directions){
		if (directions.equals("("))
			return 1;
		else if (directions.equals(")"))
			return -1;
		else
			return 0;
	}
}
