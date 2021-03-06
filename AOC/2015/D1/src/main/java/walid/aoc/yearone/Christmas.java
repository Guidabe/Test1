package walid.aoc.yearone;

/**
 * Christmas class
 *
 */
public class Christmas
{
	public int floor(String directions){

		int floor = 0;
		for (int i = 0; i < directions.length() ; i++){
			if (directions.charAt(i) == '(') floor++;
			else if (directions.charAt(i) == ')') floor --;
		}
		return floor;
	}
	
	public int basement(String directions){

		int floor = 0;
		for (int i = 0; i < directions.length() ; i++){
			if (directions.charAt(i) == '(') floor++;
			else if (directions.charAt(i) == ')') floor --;
			
			if(floor == -1)
				return i+1;
		}
		return 0;
	}
}
