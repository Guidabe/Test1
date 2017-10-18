package walid.aoc.yearone;

public class DoubleDelivery extends Delivery {
		
	public DoubleDelivery(String path) {
		super(path);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void deliver(){
		int absciss1 = 0;
		int ordinate1 = 0;
		int absciss2 = 0;
		int ordinate2 = 0;
		
		visited.put(new House(absciss1, ordinate2), 1);
		
		for (int i = 0; i < path.length(); i+=2){
			
			switch (path.charAt(i)){
				case '<' : absciss1-- ; break;
				case '>' : absciss1++ ; break;
				case 'v' :
				case 'V' : ordinate1-- ; break;
				case '^' : ordinate1++ ; break;	
			}
			
			House h = new House(absciss1, ordinate1);
			
			if (visited.containsKey(h)){
				visited.put(h, visited.get(h) + 1);
			}
			else{
				visited.put(h, 1);
			}
		}
		
		for (int i = 1; i < path.length(); i+=2){
			
			switch (path.charAt(i)){
				case '<' : absciss2-- ; break;
				case '>' : absciss2++ ; break;
				case 'v' :
				case 'V' : ordinate2-- ; break;
				case '^' : ordinate2++ ; break;	
			}
			
			House h = new House(absciss2, ordinate2);
			
			if (visited.containsKey(h)){
				visited.put(h, visited.get(h) + 1);
			}
			else{
				visited.put(h, 1);
			}
		}
	}

}
