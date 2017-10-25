package walid.aoc.yearone;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import walid.utils.FileUtils;

/**
 * Hello world!
 *
 */
public class App 
{
	private Map<SymetricPair<String>, Integer> distances = new HashMap<>();
	private Set<String> cities = new HashSet<>();
	
	public void loadConfiguration(String configurationFile) throws IOException{
		File file = FileUtils.getResourceFile(configurationFile);	
		try(BufferedReader buf = new BufferedReader(new FileReader(file))){
			String line;
			while((line = buf.readLine()) != null){
				String[] tokens = line.split(" ");
				if(tokens.length == 5){
					distances.put(new SymetricPair<String>(tokens[0], tokens[2]), Integer.parseInt(tokens[4]));
					cities.addAll(Arrays.asList(tokens[0], tokens[2]));
				}
			}
		}
	}
	
	public int minDistance(){
		int minDistance = Integer.MAX_VALUE;
		Permutation<String> p = new Permutation<>();
		
		boolean[] used = new boolean[cities.size()];
		Arrays.fill(used, false);
		
		String[] permuted = new String[cities.size()];
		p.permute(0, permuted, used, cities.stream().toArray(String[]::new));

		for (String[] perm : p.getPermutations()){
			int temp = 0;
			for (int i=0 ; i< perm.length -1; i++){
				temp += distances.get(new SymetricPair<String>(perm[i], perm[i+1]));
			}
			if(temp < minDistance){
				minDistance = temp;
			}
		}
		return minDistance;
	}
}
