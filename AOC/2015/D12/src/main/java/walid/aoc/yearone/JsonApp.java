package walid.aoc.yearone;

import java.util.stream.StreamSupport;

import com.google.gson.*;

/**
 * Hello world!
 *
 */
public class JsonApp 
{
	private JsonParser parser = new JsonParser();
	private JsonElement jsonTree;
	
	public JsonApp(String input){
		jsonTree = parser.parse(input);
	}
	
	private int recursive_sum(JsonElement e){
		if(e.isJsonObject()){
			return e.getAsJsonObject().entrySet().stream().
					mapToInt(c -> recursive_sum(c.getValue())).sum();
		}
		else if (e.isJsonArray()){
			return StreamSupport.stream(e.getAsJsonArray().spliterator(), false).
					mapToInt(c -> recursive_sum(c)).sum();
		}
		else if(e.isJsonPrimitive() && e.getAsJsonPrimitive().isNumber()){
			return e.getAsNumber().intValue();
		}
		return 0;
	}
	
	public int sum(){
		return recursive_sum(jsonTree);
	}
}
