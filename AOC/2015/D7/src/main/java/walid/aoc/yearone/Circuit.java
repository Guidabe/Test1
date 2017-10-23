package walid.aoc.yearone;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

import walid.utils.FileUtils;

/**
 * Hello world!
 *
 */
public class Circuit 
{
	private Map<String, Node> nodes = new TreeMap<String, Node>();
	
	private boolean tryParseInt(String value) {  
	     try {  
	         Integer.parseInt(value);  
	         return true;  
	      } catch (NumberFormatException e) {  
	         return false;  
	      }  
	}
	
	private Node newNode(String id){
		return (tryParseInt(id))?new Value((char) Integer.parseInt(id)):new Wire(id);
	}
	
	public void loadConfiguration(String configFile) throws IOException{
		File file = FileUtils.getResourceFile(configFile);
		try(BufferedReader buf = new BufferedReader(new FileReader(file))){
			String line;
			while((line = buf.readLine()) != null){
				String[] firstSplit = line.split("->");
				if (firstSplit.length == 2){
					
					Wire result;
					String resultId = firstSplit[1].trim();
					if (!(nodes.containsKey(resultId))){
						nodes.put(resultId, newNode(resultId));
					}
					result = (Wire) nodes.get(resultId);
					
					String[] secondSplit = firstSplit[0].trim().split(" ");
					Node input = null;
					if (secondSplit.length == 1){
						String argId = secondSplit[0];
						if (!(nodes.containsKey(argId))){
							nodes.put(argId, newNode(argId));
						}
						input = nodes.get(argId);		
					}
					else if (secondSplit.length == 2){
						String argId = secondSplit[1];
						if (!(nodes.containsKey(argId))){
							nodes.put(argId, newNode(argId));
						}
						
						String gateId = secondSplit[0]+secondSplit[1];
						if (!(nodes.containsKey(gateId))){
							nodes.put(gateId, new UnaryGate(secondSplit[0], nodes.get(argId)));
						}
						input = nodes.get(gateId);
					}
					else if (secondSplit.length == 3){
						String arg1Id = secondSplit[0];
						if (!(nodes.containsKey(arg1Id))){
							nodes.put(arg1Id, newNode(arg1Id));
						}
						
						String arg2Id = secondSplit[2];
						if (!(nodes.containsKey(arg2Id))){
							nodes.put(arg2Id, newNode(arg2Id));
						}

						String gateId = secondSplit[1]+secondSplit[0]+secondSplit[2];
						if (!(nodes.containsKey(gateId))){
							nodes.put(gateId, new BinaryGate(secondSplit[1], nodes.get(arg1Id), nodes.get(arg2Id)));
						}
						input = nodes.get(gateId);
					}
					result.setInput(input);
				}			
			}
		}
	}
	
	public int getSignal(String id){
		return nodes.get(id).signal();
	}

}
