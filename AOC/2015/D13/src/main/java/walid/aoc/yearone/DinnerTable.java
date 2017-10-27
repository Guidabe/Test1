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
import walid.utils.Permutations;

/**
 * Hello world!
 *
 */
public class DinnerTable 
{
	private File configFile;
	private Set<String> people = new HashSet<>();
	private Map<Pair<String, String>, Integer> happinessMap = new HashMap<>();
	
	public DinnerTable(String config) throws IOException {
		super();
		configFile = FileUtils.getResourceFile(config);
		try(BufferedReader buf = new BufferedReader(new FileReader(configFile))){
			String line;
			while((line = buf.readLine()) != null){
				String[] tokens = line.split(" ");
				if (tokens.length == 11){
					String p1 = tokens[0];
					String p2 = tokens[10].substring(0, tokens[10].length() - 1);
					int happiness = Integer.parseInt(tokens[3])*((tokens[2].equals("gain"))?1:-1);
					people.addAll(Arrays.asList(p1, p2));
					happinessMap.put(new Pair<>(p1,p2), happiness);			
				}
			}
		}
	}

	public int maxHappiness(){
		int happiness = 0;
		Permutations<String> permutations = new Permutations<>(people.toArray(new String[0]));
		for (String[] p : permutations.getPermutations()){
			int temp = 0;
			for (int i=0 ; i<p.length ; i++){
				int j = (i == p.length -1) ? 0 : i+1;
				temp += happinessMap.get(new Pair<>(p[i], p[j]));
			}
			for (int i= p.length - 1 ; i>=0 ; i--){
				int j = (i == 0) ? p.length - 1 : i-1;
				temp += happinessMap.get(new Pair<>(p[i], p[j]));
			}
			if (temp > happiness){
				happiness = temp;
			}
		}
		return happiness;
	}
}
