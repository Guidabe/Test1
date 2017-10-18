package walid.aoc.yearone;

import java.util.HashMap;
import java.util.Map;

public class Delivery {

	protected Map<House, Integer> visited = new HashMap<House, Integer>();
	protected String path;
	
	
	public Delivery(String path) {
		this.path = path;
	}

	public void deliver(){
		int absciss = 0;
		int ordinate = 0;
		
		visited.put(new House(absciss, ordinate), 1);
		
		for (int i = 0; i < path.length(); i++){
			
			switch (path.charAt(i)){
				case '<' : absciss-- ; break;
				case '>' : absciss++ ; break;
				case 'v' :
				case 'V' : ordinate-- ; break;
				case '^' : ordinate++ ; break;	
			}
			
			House h = new House(absciss, ordinate);
			
			if (visited.containsKey(h)){
				visited.put(h, visited.get(h) + 1);
			}
			else{
				visited.put(h, 1);
			}
		}
	}
	
	public int nbHouses(){
		return visited.size();
	}
	
}
