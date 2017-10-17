package walid.aoc.yearone;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Present {
	
	private List<Integer> dimensions = new ArrayList<Integer>(); 
	
	public Present(String line){
		String[] tokens = line.split("x");
		for (String s : tokens){
			dimensions.add(Integer.valueOf(s));
		}
		
		Collections.sort(dimensions);
	}
	
	public long paper(){ 
		long surface = 0;

		for (int i=0; i< dimensions.size(); i++){
			for (int j=i+1; j< dimensions.size(); j++){
				surface += dimensions.get(i)*dimensions.get(j)*2;
			}
		}
		
		if (dimensions.size() >=2)
			surface += dimensions.get(0)*dimensions.get(1);
		return surface;
	}

	public long ribbon(){ 
		long length = 1;

		for (Integer d:dimensions){
			length *= d;
		}
		
		if (dimensions.size() >=2)
			length += 2*(dimensions.get(0)+dimensions.get(1));
		return length;
	}

}
